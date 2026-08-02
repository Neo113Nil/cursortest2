package com.yandex.runtime.view;

import Hb.C3136a;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import com.yandex.runtime.graphics_state.GraphicsViewState;
import com.yandex.runtime.graphics_state.GraphicsViewType;
import com.yandex.runtime.logging.Logger;
import com.yandex.runtime.vulkan_launcher.VulkanLauncher;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public class PlatformViewFactory {
    private static final Set<String> VULKAN_WHITE_LIST = new HashSet(Arrays.asList("Nexus 5X"));

    public enum Attribute {
        MOVABLE,
        NONINTERACTIVE,
        OFFSCREEN_BUFFER_ENABLED,
        RENDER_DEBUG,
        VULKAN_ENABLED
    }

    public static final Set<Attribute> convertAttributeSet(Context context, AttributeSet attributeSet) {
        HashSet hashSet = new HashSet();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3136a.f10784a, 0, 0);
        try {
            if (obtainStyledAttributes.getBoolean(0, false)) {
                hashSet.add(Attribute.MOVABLE);
            }
            if (obtainStyledAttributes.getBoolean(1, false)) {
                hashSet.add(Attribute.NONINTERACTIVE);
            }
            if (!obtainStyledAttributes.getBoolean(2, true)) {
                hashSet.add(Attribute.OFFSCREEN_BUFFER_ENABLED);
            }
            if (obtainStyledAttributes.getBoolean(3, false)) {
                hashSet.add(Attribute.RENDER_DEBUG);
            }
            if (obtainStyledAttributes.getBoolean(4, false)) {
                hashSet.add(Attribute.VULKAN_ENABLED);
            }
            obtainStyledAttributes.recycle();
            return hashSet;
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private static PlatformGLSurfaceView createGLSurfaceView(Context context, Boolean bool) {
        return Build.VERSION.SDK_INT >= 34 ? new PlatformGLSurfaceView(context, bool.booleanValue()) : new PlatformGLSurfaceViewBelowApi34Workaround(context, bool.booleanValue());
    }

    public static PlatformView getPlatformView(Context context, Set<Attribute> set) {
        PlatformView platformView;
        if (set == null) {
            set = new HashSet<>();
        }
        boolean contains = set.contains(Attribute.RENDER_DEBUG);
        boolean isAndroidGo = isAndroidGo(context);
        if (isAndroidGo) {
            Logger.warn("Android Go detected. Do not use vulkan.");
        }
        boolean z11 = set.contains(Attribute.VULKAN_ENABLED) || VulkanLauncher.isVulkanEnabled();
        if (!z11) {
            Logger.warn("Vulkan is not enabled. Do not use vulkan.");
        }
        if (set.contains(Attribute.MOVABLE)) {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.OPEN_GL);
            platformView = new PlatformGLTextureView(context, contains);
        } else {
            if (!isAndroidGo && z11) {
                GraphicsViewState.logViewCreateAttempt(GraphicsViewType.VULKAN);
                try {
                    platformView = new PlatformVulkanSurfaceView(context, contains);
                } catch (RuntimeException e11) {
                    Logger.error("Failed to create Vulkan view: " + e11.getMessage());
                    Logger.error("Falling back to OpenGL view");
                }
            }
            platformView = null;
        }
        if (platformView == null) {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.OPEN_GL);
            platformView = createGLSurfaceView(context, Boolean.valueOf(contains));
        }
        if (set.contains(Attribute.NONINTERACTIVE)) {
            platformView.setNoninteractive(true);
        }
        if (set.contains(Attribute.OFFSCREEN_BUFFER_ENABLED)) {
            platformView.setOffscreenBufferEnabled(true);
        }
        return platformView;
    }

    private static boolean isAndroidGo(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }
}
