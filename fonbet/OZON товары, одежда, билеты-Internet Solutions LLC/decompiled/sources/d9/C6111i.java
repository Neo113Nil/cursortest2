package d9;

import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import java.util.Comparator;
import java.util.Map;

/* renamed from: d9.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C6111i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzv zzvVar = l.f61357a;
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
