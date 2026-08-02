package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@x8d("activity")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lrd;", "Ly8d;", "Lqd;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class rd extends y8d {
    public final Context c;
    public final Activity d;

    public rd(Context context) {
        Object obj;
        context.getClass();
        this.c = context;
        Iterator it = e5h.e(context, new ia(2)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) obj;
    }

    @Override // defpackage.y8d
    public final s6d a() {
        return new qd(this);
    }

    @Override // defpackage.y8d
    public final s6d c(s6d s6dVar, Bundle bundle, u7d u7dVar) {
        Intent intent;
        int intExtra;
        qd qdVar = (qd) s6dVar;
        Intent intent2 = qdVar.g;
        i3d i3dVar = qdVar.b;
        if (intent2 == null) {
            hc5.f(fc6.h(i3dVar.b, " does not have an Intent set.", new StringBuilder("Destination ")));
            return null;
        }
        Intent intent3 = new Intent(qdVar.g);
        if (bundle != null) {
            intent3.putExtras(bundle);
            String str = qdVar.h;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    group.getClass();
                    if (!bundle.containsKey(group)) {
                        i3c.l("Could not find ", group, " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    a6d a6dVar = (a6d) qdVar.m().get(group);
                    b8d b8dVar = a6dVar != null ? a6dVar.a : null;
                    stringBuffer.append(b8dVar != null ? b8dVar.f(b8dVar.a(bundle, group)) : Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent3.addFlags(268435456);
        }
        if (u7dVar != null && u7dVar.a) {
            intent3.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", i3dVar.b);
        Context context = this.c;
        Resources resources = context.getResources();
        if (u7dVar != null) {
            int i = u7dVar.h;
            int i2 = u7dVar.i;
            if ((i <= 0 || !Intrinsics.c(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !Intrinsics.c(resources.getResourceTypeName(i2), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                resources.getResourceName(i);
                resources.getResourceName(i2);
                qdVar.toString();
            }
        }
        context.startActivity(intent3);
        if (u7dVar != null && activity != null) {
            int i3 = u7dVar.f;
            int i4 = u7dVar.g;
            if ((i3 > 0 && Intrinsics.c(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && Intrinsics.c(resources.getResourceTypeName(i4), "animator"))) {
                resources.getResourceName(i3);
                resources.getResourceName(i4);
                qdVar.toString();
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // defpackage.y8d
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
