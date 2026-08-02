package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f2114b;

    public /* synthetic */ y0(j1 j1Var, int i5) {
        this.f2113a = i5;
        this.f2114b = j1Var;
    }

    @Override // g.a
    public final void a(Object obj) {
        switch (this.f2113a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    iArr[i5] = ((Boolean) arrayList.get(i5)).booleanValue() ? 0 : -1;
                }
                j1 j1Var = this.f2114b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) j1Var.F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    io.sentry.android.core.w0.m("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f1835a;
                    int i10 = fragmentManager$LaunchedFragmentInfo.f1836b;
                    Fragment c2 = j1Var.f1965c.c(str);
                    if (c2 == null) {
                        io.sentry.android.core.w0.m("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        c2.onRequestPermissionsResult(i10, strArr, iArr);
                        break;
                    }
                }
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                j1 j1Var2 = this.f2114b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) j1Var2.F.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    io.sentry.android.core.w0.m("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f1835a;
                    int i11 = fragmentManager$LaunchedFragmentInfo2.f1836b;
                    Fragment c8 = j1Var2.f1965c.c(str2);
                    if (c8 == null) {
                        io.sentry.android.core.w0.m("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        c8.onActivityResult(i11, activityResult.f194a, activityResult.f195b);
                        break;
                    }
                }
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                j1 j1Var3 = this.f2114b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) j1Var3.F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    io.sentry.android.core.w0.m("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f1835a;
                    int i12 = fragmentManager$LaunchedFragmentInfo3.f1836b;
                    Fragment c10 = j1Var3.f1965c.c(str3);
                    if (c10 == null) {
                        io.sentry.android.core.w0.m("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        c10.onActivityResult(i12, activityResult2.f194a, activityResult2.f195b);
                        break;
                    }
                }
        }
    }
}
