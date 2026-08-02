package androidx.fragment.app;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 extends h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1897a;

    public /* synthetic */ e1(int i5) {
        this.f1897a = i5;
    }

    @Override // h.a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f1897a) {
            case 0:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = intentSenderRequest.f197b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = intentSenderRequest.f196a;
                        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                        intentSenderRequest = new IntentSenderRequest(intentSender, null, intentSenderRequest.f198c, intentSenderRequest.f199d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (j1.L(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                g.i input = (g.i) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (aa.b.h()) {
                    Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
                    intent3.setType(aa.b.g(input.f9647a));
                    input.f9648b.getClass();
                    intent3.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent3;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent4.setType(aa.b.g(input.f9647a));
                    if (intent4.getType() != null) {
                        return intent4;
                    }
                    intent4.setType("*/*");
                    intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent4;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent5.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent5.setType(aa.b.g(input.f9647a));
                input.f9648b.getClass();
                intent5.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent5;
            case 2:
                String[] input2 = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                Intrinsics.checkNotNullParameter(input2, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
                Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                return putExtra;
            case 3:
                String input3 = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input3, "input");
                String[] input4 = {input3};
                Intrinsics.checkNotNullParameter(input4, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input4);
                Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
                return putExtra2;
            case 4:
                Intent input5 = (Intent) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input5, "input");
                return input5;
            default:
                IntentSenderRequest input6 = (IntentSenderRequest) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input6, "input");
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input6);
                Intrinsics.checkNotNullExpressionValue(putExtra3, "putExtra(...)");
                return putExtra3;
        }
    }

    @Override // h.a
    public c4.k b(Context context, Object obj) {
        switch (this.f1897a) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter((g.i) obj, "input");
                return null;
            case 2:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.length == 0) {
                    return new c4.k(kotlin.collections.n0.c());
                }
                for (String str : input) {
                    if (d0.c.a(context, str) != 0) {
                        return null;
                    }
                }
                int a7 = kotlin.collections.m0.a(input.length);
                if (a7 < 16) {
                    a7 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new c4.k(linkedHashMap);
            case 3:
                String input2 = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                if (d0.c.a(context, input2) == 0) {
                    return new c4.k(Boolean.TRUE);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // h.a
    public final Object c(Intent intent, int i5) {
        List arrayList;
        switch (this.f1897a) {
            case 1:
                if (i5 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null) {
                        Intrinsics.checkNotNullParameter(intent, "<this>");
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Uri data2 = intent.getData();
                        if (data2 != null) {
                            linkedHashSet.add(data2);
                        }
                        ClipData clipData = intent.getClipData();
                        if (clipData == null && linkedHashSet.isEmpty()) {
                            arrayList = kotlin.collections.e0.f19204a;
                        } else {
                            if (clipData != null) {
                                int itemCount = clipData.getItemCount();
                                for (int i10 = 0; i10 < itemCount; i10++) {
                                    Uri uri = clipData.getItemAt(i10).getUri();
                                    if (uri != null) {
                                        linkedHashSet.add(uri);
                                    }
                                }
                            }
                            arrayList = new ArrayList(linkedHashSet);
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (i5 != -1) {
                    break;
                } else if (intent == null) {
                    break;
                } else {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList other = new ArrayList(intArrayExtra.length);
                        for (int i11 : intArrayExtra) {
                            other.add(Boolean.valueOf(i11 == 0));
                        }
                        ArrayList q = kotlin.collections.p.q(stringArrayExtra);
                        Intrinsics.checkNotNullParameter(q, "<this>");
                        Intrinsics.checkNotNullParameter(other, "other");
                        Iterator it = q.iterator();
                        Iterator it2 = other.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(kotlin.collections.v.k(q, 10), kotlin.collections.v.k(other, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new Pair(it.next(), it2.next()));
                        }
                        break;
                    } else {
                        break;
                    }
                }
            case 3:
                if (intent == null || i5 != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z5 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (intArrayExtra2[i12] == 0) {
                                    z5 = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return new ActivityResult(intent, i5);
    }
}
