package y1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ly1/c;", "Ly1/t0;", "Ly1/b;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@s0("activity")
@SourceDebugExtension({"SMAP\nActivityNavigator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,504:1\n183#2,2:505\n90#3:507\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n*L\n46#1:505,2\n96#1:507\n*E\n"})
/* loaded from: classes.dex */
public class c extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f25538c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f25539d;

    public c(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25538c = context;
        Iterator it = bg.n.b(new ub.b(5), context).iterator();
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
        this.f25539d = (Activity) obj;
    }

    @Override // y1.t0
    public final b0 a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new b(this);
    }

    @Override // y1.t0
    public final b0 c(b0 b0Var, Bundle source, i0 i0Var) {
        Intent intent;
        int intExtra;
        b destination = (b) b0Var;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intent intent2 = destination.f25530g;
        b2.m mVar = destination.f25534b;
        if (intent2 == null) {
            throw new IllegalStateException(r4.k.n(new StringBuilder("Destination "), mVar.f3017e, " does not have an Intent set.").toString());
        }
        Intent intent3 = new Intent(destination.f25530g);
        if (source != null) {
            intent3.putExtras(source);
            String str = destination.f25531h;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    String group = matcher.group(1);
                    Intrinsics.checkNotNull(group);
                    if (!d5.k(source, group)) {
                        throw new IllegalArgumentException(("Could not find " + group + " in " + source + " to fill data pattern " + str).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    k kVar = (k) destination.e().get(group);
                    q0 q0Var = kVar != null ? kVar.f25578a : null;
                    stringBuffer.append(q0Var != null ? q0Var.f(q0Var.a(source, group)) : Uri.encode(String.valueOf(source.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f25539d;
        if (activity == null) {
            intent3.addFlags(268435456);
        }
        if (i0Var != null && i0Var.f25562a) {
            intent3.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", mVar.f3017e);
        Context context = this.f25538c;
        Resources resources = context.getResources();
        if (i0Var != null) {
            int i5 = i0Var.f25569h;
            int i10 = i0Var.f25570i;
            if ((i5 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i5), "animator")) && (i10 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i10), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i5);
                Intrinsics.checkNotNull(intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i10));
            } else {
                io.sentry.android.core.w0.m("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i5) + " and popExit resource " + resources.getResourceName(i10) + " when launching " + destination);
            }
        }
        context.startActivity(intent3);
        if (i0Var != null && activity != null) {
            int i11 = i0Var.f25567f;
            int i12 = i0Var.f25568g;
            if ((i11 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i11), "animator")) || (i12 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i12), "animator"))) {
                io.sentry.android.core.w0.m("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i11) + " and exit resource " + resources.getResourceName(i12) + "when launching " + destination);
                return null;
            }
            if (i11 >= 0 || i12 >= 0) {
                if (i11 < 0) {
                    i11 = 0;
                }
                activity.overridePendingTransition(i11, i12 >= 0 ? i12 : 0);
            }
        }
        return null;
    }

    @Override // y1.t0
    public final boolean j() {
        Activity activity = this.f25539d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
