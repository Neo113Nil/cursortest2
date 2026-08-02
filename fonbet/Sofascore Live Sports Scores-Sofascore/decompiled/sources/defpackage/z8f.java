package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z8f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ProfileEditFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8f(ProfileEditFragment profileEditFragment, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = profileEditFragment;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ProfileEditFragment profileEditFragment = this.t;
        switch (i) {
            case 0:
                return new z8f(profileEditFragment, rq3Var, 0);
            case 1:
                return new z8f(profileEditFragment, rq3Var, 1);
            case 2:
                return new z8f(profileEditFragment, rq3Var, 2);
            case 3:
                return new z8f(profileEditFragment, rq3Var, 3);
            default:
                return new z8f(profileEditFragment, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((z8f) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ProfileEditFragment profileEditFragment = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    g2 g2Var = profileEditFragment.s;
                    if (g2Var != null) {
                        String string = profileEditFragment.getString(R.string.changes_saved);
                        this.s = 1;
                        if (g2Var.invoke(string, this) == lu3Var) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    g2 g2Var2 = profileEditFragment.s;
                    if (g2Var2 != null) {
                        this.s = 1;
                        if (g2Var2.invoke(null, this) == lu3Var2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    g2 g2Var3 = profileEditFragment.s;
                    if (g2Var3 != null) {
                        String string2 = profileEditFragment.getString(R.string.changes_saved);
                        this.s = 1;
                        if (g2Var3.invoke(string2, this) == lu3Var3) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                profileEditFragment.requireActivity().finish();
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    g2 g2Var4 = profileEditFragment.s;
                    if (g2Var4 != null) {
                        this.s = 1;
                        if (g2Var4.invoke(null, this) == lu3Var4) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    g2 g2Var5 = profileEditFragment.s;
                    if (g2Var5 != null) {
                        this.s = 1;
                        if (g2Var5.invoke(null, this) == lu3Var5) {
                            break;
                        }
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
