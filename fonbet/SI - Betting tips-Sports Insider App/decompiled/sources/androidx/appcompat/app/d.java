package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends CursorAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final int f211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, ContextThemeWrapper contextThemeWrapper, Cursor cursor, AlertController$RecycleListView alertController$RecycleListView, j jVar) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f215e = gVar;
        this.f213c = alertController$RecycleListView;
        this.f214d = jVar;
        Cursor cursor2 = getCursor();
        this.f211a = cursor2.getColumnIndexOrThrow(gVar.K);
        this.f212b = cursor2.getColumnIndexOrThrow(gVar.L);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f211a));
        this.f213c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f212b) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f215e.f230b.inflate(this.f214d.L, viewGroup, false);
    }
}
