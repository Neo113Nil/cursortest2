package com.vk.clips.upload.vk.api.di;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.base.ui.i;
import java.io.File;
import java.util.Set;
import xsna.a3f;
import xsna.pwj0;
import xsna.px0;
import xsna.w9c0;
import xsna.wye;
import xsna.xgf;
import xsna.ylf;

/* compiled from: ClipsUploadVkComponent.kt */
/* loaded from: classes.dex */
public interface ClipsUploadVkComponent extends DiScopedComponent<pwj0> {
    public static final a Companion = a.a;

    /* compiled from: ClipsUploadVkComponent.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsUploadVkComponent STUB = ClipsUploadVkComponentKt.a;

        public final ClipsUploadVkComponent getSTUB() {
            return STUB;
        }
    }

    void D4(Context context);

    w9c0 K6();

    void T3(FragmentActivity fragmentActivity, String str, String str2);

    wye U5();

    ylf Uc();

    xgf f();

    void kb(FragmentActivity fragmentActivity, px0 px0Var);

    Set<File> s0();

    void s5(FragmentActivity fragmentActivity, String str, String str2, i iVar);

    a3f v9();
}
