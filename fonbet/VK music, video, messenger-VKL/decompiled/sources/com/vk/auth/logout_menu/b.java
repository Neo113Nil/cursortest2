package com.vk.auth.logout_menu;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import xsna.dw20;

/* compiled from: LogoutBottomSheet.kt */
/* loaded from: classes15.dex */
public final class b extends dw20 {
    public static final /* synthetic */ int f1 = 0;

    /* compiled from: LogoutBottomSheet.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new b();
        }
    }

    /* compiled from: LogoutBottomSheet.kt */
    /* renamed from: com.vk.auth.logout_menu.b$b, reason: collision with other inner class name */
    public static final class C0401b {
        public static void a(FragmentManager fragmentManager) {
            Fragment H = fragmentManager.H("LogoutBottomSheetTag");
            b bVar = H instanceof b ? (b) H : null;
            if (bVar != null) {
                bVar.dismiss();
            }
        }
    }
}
