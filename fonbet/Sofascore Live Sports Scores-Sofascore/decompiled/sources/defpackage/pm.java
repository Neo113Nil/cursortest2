package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pm extends ArrayAdapter {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(Context context, Gender gender) {
        super(context, R.layout.menu_panel_item, R.id.item_text);
        context.getClass();
        this.b = gender;
        this.c = b.l("F", PlayerKt.FOOTBALL_MIDFIELDER, "D", "G", "");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        switch (this.a) {
            case 1:
                return ((ArrayList) this.c).size();
            default:
                return super.getCount();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        switch (this.a) {
            case 1:
                Context context = getContext();
                context.getClass();
                return vha.t(context, (Gender) this.b, Sports.FOOTBALL, (String) CollectionsKt.a0(i, (ArrayList) this.c), false);
            default:
                return super.getItem(i);
        }
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Object obj) {
        switch (this.a) {
            case 1:
                return ((ArrayList) this.c).indexOf((String) obj);
            default:
                return super.getPosition(obj);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = ((sm) this.c).p;
                if (zArr != null && zArr[i]) {
                    ((AlertController$RecycleListView) this.b).setItemChecked(i, true);
                }
                return view2;
            default:
                return super.getView(i, view, viewGroup);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(sm smVar, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, android.R.id.text1, charSequenceArr);
        this.c = smVar;
        this.b = alertController$RecycleListView;
    }
}
