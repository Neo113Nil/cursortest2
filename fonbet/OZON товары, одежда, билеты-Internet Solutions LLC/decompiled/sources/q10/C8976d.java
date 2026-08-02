package q10;

import D00.g;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.t;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: q10.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8976d extends RecyclerView.g<a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f81389a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f81390b;

    /* renamed from: q10.d$a */
    public final class a extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f81391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8976d f81392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C8976d c8976d, View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.f81392b = c8976d;
            this.f81391a = containerView;
        }

        public static void e(g.b bVar, a aVar, C8976d c8976d) {
            t.a aVar2 = new t.a(c8976d.f81389a);
            aVar2.g("text/plain");
            aVar2.f(aVar.h(bVar));
            aVar2.c(R.string.composer_debug_menu_share_incident);
            aVar2.h();
        }

        public static void f(g.b bVar, a aVar, C8976d c8976d) {
            Object systemService = aVar.f81391a.getContext().getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            ClipData newPlainText = ClipData.newPlainText("", aVar.h(bVar));
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
            String string = c8976d.f81389a.getResources().getString(R.string.composer_debug_menu_incidents_copy);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Toast.makeText(c8976d.f81389a, string, 0).show();
        }

        private final String h(g.b bVar) {
            return ((TextView) this.f81391a.findViewById(R.id.nameTextTv)).getText().toString() + " " + bVar.b() + ". " + bVar.a();
        }

        public final void g(@NotNull g.b incident) {
            Intrinsics.checkNotNullParameter(incident, "incident");
            View view = this.f81391a;
            ((TextView) view.findViewById(R.id.widgetNameTv)).setText(incident.b());
            ((TextView) view.findViewById(R.id.errorTv)).setText(incident.a());
            ImageView imageView = (ImageView) view.findViewById(R.id.copyIv);
            C8976d c8976d = this.f81392b;
            imageView.setOnClickListener(new ViewOnClickListenerC8974b(incident, this, c8976d));
            ((ImageView) view.findViewById(R.id.shareIv)).setOnClickListener(new ViewOnClickListenerC8975c(c8976d, this, incident, 0));
        }
    }

    public C8976d(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81389a = activity;
        this.f81390b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        return this.f81390b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(a aVar, int i11) {
        a holder = aVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.g((g.b) this.f81390b.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.composer_debug_menu_item_incident, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new a(this, inflate);
    }

    public final void setItems(@NotNull List<g.b> incidents) {
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        ArrayList arrayList = this.f81390b;
        arrayList.clear();
        arrayList.addAll(incidents);
        notifyDataSetChanged();
    }
}
