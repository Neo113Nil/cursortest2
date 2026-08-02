package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import defpackage.kt8;
import defpackage.me;
import defpackage.xd;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o implements xd, kt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kt8
    public Object apply(Object obj) {
        Fragment fragment = (Fragment) this.b;
        Object obj2 = fragment.mHost;
        return obj2 instanceof me ? ((me) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                s sVar = (s) obj2;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) sVar.G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo != null) {
                    String str = fragmentManager$LaunchedFragmentInfo.a;
                    int i3 = fragmentManager$LaunchedFragmentInfo.b;
                    Fragment c = sVar.c.c(str);
                    if (c != null) {
                        c.onRequestPermissionsResult(i3, strArr, iArr);
                        break;
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                s sVar2 = (s) obj2;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) sVar2.G.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 != null) {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.a;
                    int i4 = fragmentManager$LaunchedFragmentInfo2.b;
                    Fragment c2 = sVar2.c.c(str2);
                    if (c2 != null) {
                        c2.onActivityResult(i4, activityResult.a, activityResult.b);
                        break;
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                s sVar3 = (s) obj2;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) sVar3.G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 != null) {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.a;
                    int i5 = fragmentManager$LaunchedFragmentInfo3.b;
                    Fragment c3 = sVar3.c.c(str3);
                    if (c3 != null) {
                        c3.onActivityResult(i5, activityResult2.a, activityResult2.b);
                        break;
                    }
                }
                break;
        }
    }
}
