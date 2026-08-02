package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.a70;
import defpackage.hka;
import defpackage.tc3;
import defpackage.v54;
import defpackage.wbc;
import defpackage.zb3;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ui-tooling"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final /* synthetic */ int b = 0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        String i0 = StringsKt.i0(stringExtra, '.');
        String e0 = StringsKt.e0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            zb3.a(this, new tc3(-840626948, new v54(i0, e0), true));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i = 0;
        if (cls == null) {
            zb3.a(this, new tc3(-1901447514, new wbc(11, i0, e0, new Object[0]), true));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Constructor<?> constructor2 = constructors[i];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z) {
                            break;
                        }
                        z = true;
                        constructor = constructor2;
                    }
                    i++;
                } else if (!z) {
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null).getClass();
            throw new ClassCastException();
        } catch (hka unused2) {
            a70.r("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
