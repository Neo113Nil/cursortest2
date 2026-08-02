package defpackage;

import android.os.Bundle;
import com.sofascore.results.manager.ManagerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bsb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ManagerActivity b;

    public /* synthetic */ bsb(ManagerActivity managerActivity, int i) {
        this.a = i;
        this.b = managerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ManagerActivity managerActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ManagerActivity.R;
                Bundle extras = managerActivity.getIntent().getExtras();
                break;
            case 1:
                int i3 = ManagerActivity.R;
                break;
            case 2:
                int i4 = ManagerActivity.R;
                managerActivity.N();
                break;
            default:
                int i5 = ManagerActivity.R;
                ((ctb) managerActivity.O.getValue()).F();
                break;
        }
        return Unit.a;
    }
}
