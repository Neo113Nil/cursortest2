package y10;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: y10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C10824b extends AbstractC7737t implements Function0<List<View>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f105913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10824b(i iVar) {
        super(0);
        this.f105913b = iVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0020 */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<View> invoke() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        l10.i iVar;
        i iVar2 = this.f105913b;
        recyclerView = iVar2.f105925b;
        ArrayList m02 = C7714v.m0(recyclerView);
        recyclerView2 = iVar2.f105925b;
        for (ViewParent parent = recyclerView2.getParent(); parent != iVar.Y() && (parent instanceof ViewGroup); parent = ((ViewGroup) parent).getParent()) {
            m02.add(parent);
        }
        return m02;
    }
}
