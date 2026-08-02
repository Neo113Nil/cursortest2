package q10;

import D00.g;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq10/e;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.google.android.material.bottomsheet.b {
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.composer_debug_menu_fragment_incidents, viewGroup, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        C8976d c8976d = new C8976d(requireActivity);
        ((ImageView) view.findViewById(R.id.backIv)).setOnClickListener(new EI.a(this, 10));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.incidentsRv);
        recyclerView.setAdapter(c8976d);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        Bundle arguments = getArguments();
        g gVar = arguments != null ? (g) arguments.getParcelable("INCIDENTS_PARAM") : null;
        if (gVar != null) {
            c8976d.setItems(gVar.a());
        }
    }
}
