package F0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f3229i;

    /* renamed from: j, reason: collision with root package name */
    public int f3230j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutInflater f3231k;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f3230j = i10;
        this.f3229i = i10;
        this.f3231k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // F0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3231k.inflate(this.f3230j, viewGroup, false);
    }

    @Override // F0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3231k.inflate(this.f3229i, viewGroup, false);
    }
}
