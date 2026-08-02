package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f18974a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f18975b = new Object();

    public static Bundle a(o.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d10 = aVar.d();
        bundle.putInt("icon", d10 != null ? d10.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(x xVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", xVar.i());
        bundle.putCharSequence(AnnotatedPrivateKey.LABEL, xVar.h());
        bundle.putCharSequenceArray("choices", xVar.e());
        bundle.putBoolean("allowFreeFormInput", xVar.c());
        bundle.putBundle("extras", xVar.g());
        Set d10 = xVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d10.size());
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] c(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            bundleArr[i10] = b(xVarArr[i10]);
        }
        return bundleArr;
    }
}
