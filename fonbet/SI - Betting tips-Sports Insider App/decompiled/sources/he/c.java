package he;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.x0;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.news.NewsTable;
import com.sports.insider.ui.news.fragment.NewsFragment;
import fg.d;
import hc.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import zc.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10587a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final a f10588b;

    /* renamed from: c, reason: collision with root package name */
    public NewsFragment f10589c;

    /* renamed from: d, reason: collision with root package name */
    public final k f10590d;

    public c() {
        a aVar = new a(0);
        aVar.f10585e = new ArrayList();
        aVar.f10586f = new ArrayList();
        this.f10588b = aVar;
        this.f10590d = new k();
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemCount() {
        return this.f10587a.size();
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemViewType(int i5) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onBindViewHolder(d2 d2Var, int i5) {
        b holder = (b) d2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i5 == -1 || i5 >= this.f10587a.size()) {
            return;
        }
        h oneNews = (h) this.f10587a.get(i5);
        holder.getClass();
        Intrinsics.checkNotNullParameter(oneNews, "oneNews");
        String str = oneNews.f10496c;
        TextView textView = (TextView) holder.itemView.findViewById(R.id.titleText);
        if (textView != null) {
            textView.setText(str);
        }
        String str2 = oneNews.f10499f;
        TextView textView2 = (TextView) holder.itemView.findViewById(R.id.dateText);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        holder.b(oneNews.f10497d);
    }

    @Override // androidx.recyclerview.widget.x0
    public final d2 onCreateViewHolder(ViewGroup parent, int i5) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_news, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        b bVar = new b(itemView);
        this.f10590d.getClass();
        Typeface a7 = k.a();
        if (a7 != null) {
            ((TextView) bVar.itemView.findViewById(R.id.titleText)).setTypeface(a7);
        }
        Typeface c2 = k.c();
        if (c2 != null) {
            ((TextView) bVar.itemView.findViewById(R.id.dateText)).setTypeface(c2);
        }
        View itemView2 = bVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        io.sentry.config.a.y(itemView2, 600L, new d(3, bVar, this));
        return bVar;
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onViewRecycled(d2 d2Var) {
        b holder = (b) d2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        View findViewById = holder.itemView.findViewById(R.id.bgnImg);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a.a.p((ImageView) findViewById);
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onBindViewHolder(d2 d2Var, int i5, List payloads) {
        b holder = (b) d2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (!payloads.isEmpty()) {
            Object firstOrNull = CollectionsKt.firstOrNull(payloads);
            Bundle bundle = firstOrNull instanceof Bundle ? (Bundle) firstOrNull : null;
            if (bundle != null && !bundle.isEmpty()) {
                for (String str : bundle.keySet()) {
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != -577741570) {
                            if (hashCode != 110371416) {
                                if (hashCode == 1688646514 && str.equals("dateTimeFormat")) {
                                    String string = bundle.getString("dateTimeFormat");
                                    TextView textView = (TextView) holder.itemView.findViewById(R.id.dateText);
                                    if (textView != null) {
                                        textView.setText(string);
                                    }
                                }
                            } else if (str.equals("title")) {
                                String string2 = bundle.getString("title");
                                TextView textView2 = (TextView) holder.itemView.findViewById(R.id.titleText);
                                if (textView2 != null) {
                                    textView2.setText(string2);
                                }
                            }
                        } else if (str.equals(NewsTable.PICTURE_COLUMN)) {
                            holder.b(bundle.getString(NewsTable.PICTURE_COLUMN));
                        }
                    }
                }
                return;
            }
        }
        super.onBindViewHolder(holder, i5, payloads);
    }
}
