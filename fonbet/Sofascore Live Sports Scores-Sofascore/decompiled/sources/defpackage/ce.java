package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ce extends yd {
    public final /* synthetic */ int a;

    public /* synthetic */ ce(int i) {
        this.a = i;
    }

    @Override // defpackage.yd
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                lge lgeVar = (lge) obj;
                lgeVar.getClass();
                if (y9.h()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(y9.f(lgeVar.a));
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(y9.f(lgeVar.a));
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity == null) {
                    a70.r("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(y9.f(lgeVar.a));
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent3;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra.getClass();
                return putExtra;
            case 2:
                String str = (String) obj;
                str.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                putExtra2.getClass();
                return putExtra2;
            case 3:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            case 4:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                intentSenderRequest.getClass();
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                putExtra3.getClass();
                return putExtra3;
            default:
                IntentSenderRequest intentSenderRequest2 = (IntentSenderRequest) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = intentSenderRequest2.b;
                if (intent6 != null && (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = intentSenderRequest2.a;
                        intentSender.getClass();
                        intentSenderRequest2 = new IntentSenderRequest(intentSender, null, intentSenderRequest2.c, intentSenderRequest2.d);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
                if (s.O(2)) {
                    intent5.toString();
                }
                return intent5;
        }
    }

    @Override // defpackage.yd
    public t9d b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                ((lge) obj).getClass();
                return null;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    return new t9d(lm5Var);
                }
                for (String str : strArr) {
                    if (eq3.b(context, str) != 0) {
                        return null;
                    }
                }
                int c = sub.c(strArr.length);
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new t9d(linkedHashMap);
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                if (eq3.b(context, str3) == 0) {
                    return new t9d(Boolean.TRUE);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // defpackage.yd
    public final Object c(Intent intent, int i) {
        List arrayList;
        r2 = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Uri data2 = intent.getData();
                        if (data2 != null) {
                            linkedHashSet.add(data2);
                        }
                        ClipData clipData = intent.getClipData();
                        if (clipData == null && linkedHashSet.isEmpty()) {
                            arrayList = km5.a;
                        } else {
                            if (clipData != null) {
                                int itemCount = clipData.getItemCount();
                                for (int i2 = 0; i2 < itemCount; i2++) {
                                    Uri uri = clipData.getItemAt(i2).getUri();
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
            case 1:
                if (i != -1) {
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    break;
                } else if (intent == null) {
                    lm5 lm5Var2 = lm5.a;
                    lm5Var2.getClass();
                    break;
                } else {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        break;
                    } else {
                        lm5 lm5Var3 = lm5.a;
                        lm5Var3.getClass();
                        break;
                    }
                }
            case 2:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                if (intArrayExtra2[i4] == 0) {
                                    z = true;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    break;
                }
        }
        return new ActivityResult(intent, i);
    }
}
