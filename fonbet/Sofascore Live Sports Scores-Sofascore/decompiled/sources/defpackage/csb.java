package defpackage;

import com.sofascore.results.manager.ManagerActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class csb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ManagerActivity b;

    public /* synthetic */ csb(ManagerActivity managerActivity, int i) {
        this.a = i;
        this.b = managerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ManagerActivity managerActivity = this.b;
        switch (i) {
            case 0:
                return managerActivity.getDefaultViewModelProviderFactory();
            case 1:
                return managerActivity.getViewModelStore();
            default:
                return managerActivity.getDefaultViewModelCreationExtras();
        }
    }
}
