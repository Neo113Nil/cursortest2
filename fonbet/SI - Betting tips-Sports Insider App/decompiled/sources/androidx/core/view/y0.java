package androidx.core.view;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f1406d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f1407a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f1408b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f1409c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f1407a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a7 = a(viewGroup.getChildAt(childCount));
                if (a7 != null) {
                    return a7;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
