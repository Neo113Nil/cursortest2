package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import xsna.c5g;
import xsna.drm0;
import xsna.jai;
import xsna.nnc;
import xsna.o21;
import xsna.oq0;
import xsna.uki0;
import xsna.v8i;
import xsna.w4d0;
import xsna.wlb0;

/* compiled from: PreviewActivity.android.kt */
/* loaded from: classes11.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final /* synthetic */ int f = 0;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        r10 = null;
     */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        Object[] array;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        String m0 = drm0.m0(JwtParser.SEPARATOR_CHAR, stringExtra, stringExtra);
        String i0 = drm0.i0(JwtParser.SEPARATOR_CHAR, stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            v8i.a(this, new jai(-840626948, new o21(7, m0, i0), true));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e);
            cls = null;
        }
        int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i = 0;
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
                if (constructor == null) {
                    throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                }
                constructor.setAccessible(true);
                w4d0 w4d0Var = (w4d0) constructor.newInstance(null);
                if (intExtra >= 0) {
                    uki0 h = w4d0Var.h();
                    if (intExtra < 0) {
                        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + intExtra + JwtParser.SEPARATOR_CHAR);
                    }
                    int i2 = 0;
                    for (Object obj : h) {
                        int i3 = i2 + 1;
                        if (intExtra == i2) {
                            List singletonList = Collections.singletonList(obj);
                            ArrayList arrayList = new ArrayList(c5g.u(singletonList, 10));
                            Iterator it = singletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(wlb0.v(it.next()));
                            }
                            array = arrayList.toArray(new Object[0]);
                        } else {
                            i2 = i3;
                        }
                    }
                    throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + intExtra + JwtParser.SEPARATOR_CHAR);
                }
                uki0 h2 = w4d0Var.h();
                int count = w4d0Var.getCount();
                Iterator it2 = h2.iterator();
                array = new Object[count];
                for (int i4 = 0; i4 < count; i4++) {
                    array[i4] = it2.next();
                }
            } catch (KotlinReflectionNotSupportedError unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        } else {
            array = new Object[0];
        }
        if (array.length > 1) {
            v8i.a(this, new jai(-861939235, new nnc(array, m0, i0, 2), true));
        } else {
            v8i.a(this, new jai(-1901447514, new oq0(m0, i0, array), true));
        }
    }
}
