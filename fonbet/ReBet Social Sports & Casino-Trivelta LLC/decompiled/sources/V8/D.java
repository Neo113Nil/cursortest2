package V8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class D extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    public final List f12594A;

    /* renamed from: B, reason: collision with root package name */
    public C f12595B;

    /* renamed from: z, reason: collision with root package name */
    public final S8.e f12596z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Context context, S8.e theme, Function1 listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12596z = theme;
        List emptyList = CollectionsKt.emptyList();
        this.f12594A = emptyList;
        LayoutInflater.from(context).inflate(O8.t.f8541l, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(O8.s.f8505n0);
        this.f12595B = new C(emptyList, theme, listener);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.Q2(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.g());
        recyclerView.setAdapter(this.f12595B);
        this.f12595B.notifyDataSetChanged();
    }

    @NotNull
    public final S8.e getTheme() {
        return this.f12596z;
    }

    public final void x(List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f12595B.h(suggestions);
        this.f12595B.notifyDataSetChanged();
    }
}
