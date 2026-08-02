package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bbc extends wb0 {
    public static final /* synthetic */ int U = 0;
    public boolean A;
    public boolean B;
    public ImageButton C;
    public Button D;
    public ImageView E;
    public View F;
    public ImageView G;
    public TextView H;
    public TextView I;
    public String J;
    public wj9 K;
    public final jac L;
    public MediaDescriptionCompat M;
    public vac N;
    public Bitmap O;
    public Uri P;
    public boolean Q;
    public Bitmap R;
    public int S;
    public final boolean T;
    public final pbc g;
    public final aac h;
    public ibc i;
    public obc j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final Context o;
    public boolean p;
    public boolean q;
    public long r;
    public final gl0 s;
    public RecyclerView t;
    public zac u;
    public abc v;
    public HashMap w;
    public obc x;
    public HashMap y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bbc(Context context) {
        super(r2, r0 == 0 ? hda.F(r2) : r0);
        ContextThemeWrapper u = hda.u(context, false);
        int I = hda.I(R.attr.mediaRouteTheme, u);
        this.i = ibc.c;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.s = new gl0(this, 9);
        Context context2 = getContext();
        this.o = context2;
        this.g = pbc.d(context2);
        this.T = pbc.g();
        this.h = new aac(this, 4);
        this.j = pbc.f();
        this.L = new jac(this, 1);
        h(pbc.e());
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            obc obcVar = (obc) list.get(size);
            if (obcVar.d() || !obcVar.g || !obcVar.h(this.i) || this.j == obcVar) {
                list.remove(size);
            }
        }
    }

    public final void g() {
        MediaDescriptionCompat mediaDescriptionCompat = this.M;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        vac vacVar = this.N;
        Bitmap bitmap2 = vacVar == null ? this.O : vacVar.a;
        Uri uri2 = vacVar == null ? this.P : vacVar.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            vac vacVar2 = this.N;
            if (vacVar2 != null) {
                vacVar2.cancel(true);
            }
            vac vacVar3 = new vac(this);
            this.N = vacVar3;
            vacVar3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        wj9 wj9Var = this.K;
        jac jacVar = this.L;
        if (wj9Var != null) {
            wj9Var.M(jacVar);
            this.K = null;
        }
        if (mediaSessionCompat$Token != null && this.q) {
            wj9 wj9Var2 = new wj9(this.o, mediaSessionCompat$Token);
            this.K = wj9Var2;
            wj9Var2.K(jacVar);
            MediaMetadata metadata = ((a) this.K.b).a.getMetadata();
            if (metadata != null) {
                dh0 dh0Var = MediaMetadataCompat.d;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = metadata;
            } else {
                mediaMetadataCompat = null;
            }
            this.M = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
            g();
            k();
        }
    }

    public final void i(ibc ibcVar) {
        if (ibcVar == null) {
            a70.p("selector must not be null");
            return;
        }
        if (this.i.equals(ibcVar)) {
            return;
        }
        this.i = ibcVar;
        if (this.q) {
            pbc pbcVar = this.g;
            aac aacVar = this.h;
            pbcVar.h(aacVar);
            pbcVar.a(ibcVar, aacVar, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.o;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : wca.y(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.O = null;
        this.P = null;
        g();
        k();
        m();
    }

    public final void k() {
        Bitmap bitmap;
        if ((this.x != null || this.z) ? true : !this.p) {
            this.B = true;
            return;
        }
        this.B = false;
        if (!this.j.g() || this.j.d()) {
            dismiss();
        }
        if (!this.Q || (((bitmap = this.R) != null && bitmap.isRecycled()) || this.R == null)) {
            Bitmap bitmap2 = this.R;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Objects.toString(this.R);
            }
            this.G.setVisibility(8);
            this.F.setVisibility(8);
            this.E.setImageBitmap(null);
        } else {
            this.G.setVisibility(0);
            this.G.setImageBitmap(this.R);
            this.G.setBackgroundColor(this.S);
            this.F.setVisibility(0);
            Bitmap bitmap3 = this.R;
            RenderScript create = RenderScript.create(this.o);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap3);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap3.copy(bitmap3.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.E.setImageBitmap(copy);
        }
        this.Q = false;
        this.R = null;
        this.S = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.M;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.M;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
        boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
        TextView textView = this.H;
        if (isEmpty) {
            textView.setText(this.J);
        } else {
            textView.setText(charSequence);
        }
        TextView textView2 = this.I;
        if (isEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(charSequence2);
            this.I.setVisibility(0);
        }
    }

    public final void l() {
        ArrayList arrayList = this.k;
        arrayList.clear();
        ArrayList arrayList2 = this.l;
        arrayList2.clear();
        ArrayList arrayList3 = this.m;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.j.v));
        lbc a = this.j.a();
        if (a != null) {
            nbc nbcVar = this.j.a;
            pbc.b();
            for (obc obcVar : Collections.unmodifiableList(nbcVar.b)) {
                if (a.o(obcVar)) {
                    arrayList2.add(obcVar);
                }
                cbc cbcVar = (cbc) a.x.get(obcVar.c);
                if (cbcVar != null && cbcVar.e) {
                    arrayList3.add(obcVar);
                }
            }
        }
        f(arrayList2);
        f(arrayList3);
        qe8 qe8Var = qe8.g;
        Collections.sort(arrayList, qe8Var);
        Collections.sort(arrayList2, qe8Var);
        Collections.sort(arrayList3, qe8Var);
        this.u.r();
    }

    public final void m() {
        if (this.q) {
            if (SystemClock.uptimeMillis() - this.r < 300) {
                gl0 gl0Var = this.s;
                gl0Var.removeMessages(1);
                gl0Var.sendEmptyMessageAtTime(1, this.r + 300);
                return;
            }
            if ((this.x != null || this.z) ? true : !this.p) {
                this.A = true;
                return;
            }
            this.A = false;
            if (!this.j.g() || this.j.d()) {
                dismiss();
            }
            this.r = SystemClock.uptimeMillis();
            this.u.q();
        }
    }

    public final void n() {
        if (this.A) {
            m();
        }
        if (this.B) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
        this.g.a(this.i, this.h, 1);
        l();
        h(pbc.e());
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.o;
        decorView.setBackgroundColor(context.getColor(hda.J(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.C = imageButton;
        imageButton.setColorFilter(-1);
        this.C.setOnClickListener(new uac(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.D = button;
        button.setTextColor(-1);
        this.D.setOnClickListener(new uac(this, 1));
        this.u = new zac(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.t = recyclerView;
        recyclerView.setAdapter(this.u);
        this.t.setLayoutManager(new LinearLayoutManager());
        this.v = new abc(this, 0);
        this.w = new HashMap();
        this.y = new HashMap();
        this.E = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.F = findViewById(R.id.mr_cast_meta_black_scrim);
        this.G = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.H = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.I = textView2;
        textView2.setTextColor(-1);
        this.J = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.p = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = false;
        this.g.h(this.h);
        this.s.removeCallbacksAndMessages(null);
        h(null);
    }
}
