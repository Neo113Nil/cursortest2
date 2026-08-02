package ru.ozon.android.messenger.framework.composer.utils;

import M4.c;
import Mw.C3641a;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f86819a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f86820b;

    public b(int i11) {
        this.f86819a = i11;
    }

    public static Bundle a(b bVar) {
        Bundle bundle = new Bundle();
        Integer num = bVar.f86820b;
        bundle.putInt("SOFT_INPUT_MODE_KEY", num != null ? num.intValue() : -1);
        return bundle;
    }

    public static final void b(b bVar, r rVar) {
        Integer num = bVar.f86820b;
        if (num != null) {
            int intValue = num.intValue();
            Window window = rVar.getWindow();
            if (window != null) {
                window.setSoftInputMode(intValue);
            }
        }
    }

    public static final void c(b bVar, r rVar) {
        bVar.getClass();
        Window window = rVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(bVar.f86819a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r1 != (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(@NotNull r activity, @NotNull ru.ozon.android.messenger.framework.composer.screen.b owner) {
        Integer num;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().a(new a(this, activity, owner));
        c savedStateRegistry = owner.getSavedStateRegistry();
        Bundle b11 = savedStateRegistry.b("BUNDLE_SOFT_INPUT_MODE");
        Integer num2 = null;
        if (b11 != null) {
            int i11 = b11.getInt("SOFT_INPUT_MODE_KEY");
            num = Integer.valueOf(i11);
        }
        num = null;
        if (num != null) {
            this.f86820b = num;
        } else if (this.f86820b == null) {
            Window window = activity.getWindow();
            if (window != null && (attributes = window.getAttributes()) != null) {
                num2 = Integer.valueOf(attributes.softInputMode);
            }
            this.f86820b = num2;
        }
        savedStateRegistry.i("BUNDLE_SOFT_INPUT_MODE");
        savedStateRegistry.g("BUNDLE_SOFT_INPUT_MODE", new C3641a(this, 1));
    }
}
