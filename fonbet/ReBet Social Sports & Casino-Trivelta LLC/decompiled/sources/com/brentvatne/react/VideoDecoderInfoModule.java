package com.brentvatne.react;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/brentvatne/react/VideoDecoderInfoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", "p", "", "getWidevineLevel", "(Lcom/facebook/react/bridge/Promise;)V", "mimeType", "", "width", "height", "isCodecSupported", "(Ljava/lang/String;DDLcom/facebook/react/bridge/Promise;)V", "isHEVCSupported", "Companion", "a", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVideoDecoderInfoModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoDecoderInfoModule.kt\ncom/brentvatne/react/VideoDecoderInfoModule\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,73:1\n12637#2,2:74\n*S KotlinDebug\n*F\n+ 1 VideoDecoderInfoModule.kt\ncom/brentvatne/react/VideoDecoderInfoModule\n*L\n58#1:74,2\n*E\n"})
/* loaded from: classes.dex */
public final class VideoDecoderInfoModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String REACT_CLASS = "VideoDecoderInfoModule";

    @NotNull
    private static final String SECURITY_LEVEL_PROPERTY = "securityLevel";

    @NotNull
    private static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);

    public VideoDecoderInfoModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactMethod
    public final void getWidevineLevel(@NotNull Promise p10) {
        Intrinsics.checkNotNullParameter(p10, "p");
        int i10 = 0;
        try {
            String propertyString = new MediaDrm(WIDEVINE_UUID).getPropertyString(SECURITY_LEVEL_PROPERTY);
            Intrinsics.checkNotNullExpressionValue(propertyString, "getPropertyString(...)");
            switch (propertyString.hashCode()) {
                case 2405:
                    if (propertyString.equals("L1")) {
                        i10 = 1;
                        break;
                    }
                    break;
                case 2406:
                    if (!propertyString.equals("L2")) {
                        break;
                    } else {
                        i10 = 2;
                        break;
                    }
                case 2407:
                    if (!propertyString.equals("L3")) {
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
            }
        } catch (UnsupportedSchemeException e10) {
            e10.printStackTrace();
        }
        p10.resolve(Integer.valueOf(i10));
    }

    @ReactMethod
    public final void isCodecSupported(@Nullable String mimeType, double width, double height, @Nullable Promise p10) {
        boolean isHardwareAccelerated;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        Intrinsics.checkNotNull(mimeType);
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(mimeType, (int) width, (int) height);
        Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
        String findDecoderForFormat = mediaCodecList.findDecoderForFormat(createVideoFormat);
        if (findDecoderForFormat == null) {
            if (p10 != null) {
                p10.resolve("unsupported");
                return;
            }
            return;
        }
        if (i10 < 29) {
            if (p10 != null) {
                p10.resolve("software");
                return;
            }
            return;
        }
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        int length = codecInfos.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            MediaCodecInfo mediaCodecInfo = codecInfos[i11];
            if (StringsKt.equals(mediaCodecInfo.getName(), findDecoderForFormat, true)) {
                isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                if (isHardwareAccelerated) {
                    z10 = true;
                    break;
                }
            }
            i11++;
        }
        if (p10 != null) {
            p10.resolve(z10 ? "software" : "hardware");
        }
    }

    @ReactMethod
    public final void isHEVCSupported(@NotNull Promise p10) {
        Intrinsics.checkNotNullParameter(p10, "p");
        isCodecSupported("video/hevc", 1920.0d, 1080.0d, p10);
    }
}
