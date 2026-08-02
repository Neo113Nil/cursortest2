package ru.ozon.app.android.videomolecule.presentation;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\bR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/VideoMoleculeConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "color", "", "setStatusBarColor", "(Ljava/lang/Integer;)V", "flags", "setFlags", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "onStop", "originalFlags", "Ljava/lang/Integer;", "getOriginalFlags", "()Ljava/lang/Integer;", "setOriginalFlags", "portraitFlags", "getPortraitFlags", "setPortraitFlags", "originalStatusBarColor", "getOriginalStatusBarColor", "setOriginalStatusBarColor", "customStatusBarColor", "getCustomStatusBarColor", "setCustomStatusBarColor", "landscapeFlags", "I", "getLandscapeFlags", "()I", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoMoleculeConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Integer customStatusBarColor;
    private final int landscapeFlags = 5894;
    private Integer originalFlags;
    private Integer originalStatusBarColor;
    private Integer portraitFlags;

    private final void setFlags(Integer flags) {
        r a11;
        Window window;
        View decorView;
        if (flags == null || (a11 = getContainer().a()) == null || (window = a11.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(flags.intValue());
    }

    private final void setStatusBarColor(Integer color) {
        Window window;
        if (color != null) {
            int intValue = color.intValue();
            r a11 = getContainer().a();
            if (a11 == null || (window = a11.getWindow()) == null) {
                return;
            }
            window.setStatusBarColor(intValue);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 1) {
            setFlags(this.portraitFlags);
        } else {
            setFlags(Integer.valueOf(this.landscapeFlags));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Window window;
        View decorView;
        Window window2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        int systemUiVisibility = decorView.getSystemUiVisibility();
        this.portraitFlags = Integer.valueOf(systemUiVisibility & (-8193));
        this.originalFlags = Integer.valueOf(systemUiVisibility);
        r a12 = getContainer().a();
        this.originalStatusBarColor = (a12 == null || (window2 = a12.getWindow()) == null) ? null : Integer.valueOf(window2.getStatusBarColor());
        r a13 = getContainer().a();
        this.customStatusBarColor = a13 != null ? Integer.valueOf(a13.getColor(R$color.oz_semantic_bg_videopleer)) : null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Resources resources;
        Configuration configuration;
        Intrinsics.checkNotNullParameter(owner, "owner");
        setStatusBarColor(this.customStatusBarColor);
        r a11 = getContainer().a();
        if (a11 == null || (resources = a11.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) {
            setFlags(this.portraitFlags);
        } else {
            setFlags(Integer.valueOf(this.landscapeFlags));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setStatusBarColor(this.originalStatusBarColor);
        setFlags(this.originalFlags);
    }
}
