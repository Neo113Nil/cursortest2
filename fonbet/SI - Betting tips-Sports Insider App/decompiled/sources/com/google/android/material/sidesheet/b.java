package com.google.android.material.sidesheet;

import com.sports.insider.ui.views.DrawerMenu;
import f0.j;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5954c;

    public /* synthetic */ b(int i5, int i10, Object obj) {
        this.f5952a = i10;
        this.f5954c = obj;
        this.f5953b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5952a) {
            case 0:
                ((SideSheetBehavior) this.f5954c).lambda$setState$0(this.f5953b);
                break;
            case 1:
                ((j) this.f5954c).onFontRetrievalFailed(this.f5953b);
                break;
            default:
                DrawerMenu drawerMenu = (DrawerMenu) this.f5954c;
                Function1 function1 = drawerMenu.f7355f;
                int i5 = this.f5953b;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i5));
                }
                drawerMenu.f7351b.remove(Integer.valueOf(i5));
                break;
        }
    }
}
