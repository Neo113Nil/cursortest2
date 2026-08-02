package androidx.core.view;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c1 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f1295a;

    public c1(RecyclerView recyclerView) {
        this.f1295a = recyclerView;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new d1(this.f1295a);
    }
}
