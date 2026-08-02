package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;
import androidx.mediarouter.app.MediaRouteButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bac extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ MediaRouteButton c;

    public bac(MediaRouteButton mediaRouteButton, int i, Context context) {
        this.c = mediaRouteButton;
        this.a = i;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = MediaRouteButton.p;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return td4.d0(i, this.b);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            MediaRouteButton.p.put(this.a, drawable.getConstantState());
        }
        this.c.g = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        MediaRouteButton mediaRouteButton = this.c;
        if (drawable != null) {
            MediaRouteButton.p.put(i, drawable.getConstantState());
            mediaRouteButton.g = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.p.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mediaRouteButton.g = null;
        }
        mediaRouteButton.setRemoteIndicatorDrawableInternal(drawable);
    }
}
