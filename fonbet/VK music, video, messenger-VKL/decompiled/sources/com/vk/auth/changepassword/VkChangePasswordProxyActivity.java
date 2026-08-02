package com.vk.auth.changepassword;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a0a;
import xsna.ai6;
import xsna.alk;
import xsna.blk;
import xsna.bnj0;
import xsna.c5g;
import xsna.dju0;
import xsna.e43;
import xsna.epx;
import xsna.ho8;

/* compiled from: VkChangePasswordProxyActivity.kt */
/* loaded from: classes15.dex */
public final class VkChangePasswordProxyActivity extends VkSdkActivity {
    public static final List<b> f = e43.l(new b("com.vkontakte.android", "86259288a43f6c409a922bc3ce40ba08085bbadb"), new b("com.vkontakte.android", "48761eef50ee53afc4cc9c5f10e6bde7f8f5b82f"));

    /* compiled from: VkChangePasswordProxyActivity.kt */
    public static final class a {
        public final ActivityInfo a;
        public final b b;

        public a(ActivityInfo activityInfo, b bVar) {
            this.a = activityInfo;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ApplicationInfo(activityInfo=" + this.a + ", signInfo=" + this.b + ')';
        }
    }

    /* compiled from: VkChangePasswordProxyActivity.kt */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SignInfo(packageName=");
            sb.append(this.a);
            sb.append(", digestHex=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public final void O1() {
        long longExtra = getIntent().getLongExtra("service_vk_id", 0L);
        Intent intent = new Intent(this, (Class<?>) VkChangePasswordActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("directUrl", "https://id." + a0a.d + "/account/#/password-change");
        bundle.putLong("service_vk_id", longExtra);
        startActivityForResult(intent.putExtras(bundle), 5931);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 5931) {
            if (i2 == -1) {
                dju0.a.a(blk.f);
                finish();
            } else if (i2 == 0) {
                dju0.a.a(alk.b);
                finish();
            } else {
                if (i2 != 1) {
                    return;
                }
                O1();
            }
        }
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        long longExtra = getIntent().getLongExtra("service_vk_id", 0L);
        Intent intent = new Intent("com.vkontakte.android.action.CHANGE_PASSWORD_V1");
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList(c5g.u(queryIntentActivities, 10));
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            String str = activityInfo.packageName;
            bnj0 bnj0Var = bnj0.a;
            bnj0Var.getClass();
            arrayList.add(new a(activityInfo, new b(str, bnj0.b(this, str, new ai6(1, bnj0Var, bnj0.class, "calculateDigestHex", "calculateDigestHex(Landroid/content/pm/Signature;)Ljava/lang/String;", 0, 10)))));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (f.contains(((a) obj).b)) {
                    break;
                }
            }
        }
        a aVar = (a) obj;
        if (aVar == null) {
            O1();
            return;
        }
        ActivityInfo activityInfo2 = aVar.a;
        Intent component = intent.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
        Bundle bundle2 = new Bundle();
        bundle2.putString("directUrl", "https://id." + a0a.d + "/account/#/password-change");
        bundle2.putLong("service_vk_id", longExtra);
        startActivityForResult(component.putExtras(bundle2), 5931);
    }
}
