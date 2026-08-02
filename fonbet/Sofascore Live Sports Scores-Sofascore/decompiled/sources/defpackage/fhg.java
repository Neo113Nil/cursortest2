package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fhg {
    public final Context a;
    public final ExoPlayer b;
    public final ffg c;
    public final TextureView d;
    public SurfaceTexture e;
    public final ImageView f;
    public boolean g;
    public long h;
    public final ImageView i;
    public final ehg j;
    public final int k;
    public final mqi l;
    public final mqi m;
    public final mqi n;
    public final mqi o;
    public final mqi p;
    public final mqi q;

    public fhg(Context context, ExoPlayer exoPlayer, ffg ffgVar) {
        this.a = context;
        this.b = exoPlayer;
        this.c = ffgVar;
        ((vg6) exoPlayer).m.a(new chg(this));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f = imageView;
        this.i = imageView;
        ehg ehgVar = new ehg(this, context);
        ehgVar.addView(textureView, new ViewGroup.LayoutParams(-1, -1));
        this.j = ehgVar;
        Integer num = ffgVar.e;
        final int i = 2;
        final int i2 = 4;
        this.k = (num == null || num.intValue() <= 4) ? 2 : 4;
        final int i3 = 0;
        this.l = ypa.b(new Function0(this) { // from class: bhg
            public final /* synthetic */ fhg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                fhg fhgVar = this.b;
                switch (i4) {
                    case 0:
                        int b = fhgVar.b();
                        int i5 = fhgVar.k;
                        Bitmap createBitmap = Bitmap.createBitmap(b / i5, fhgVar.a() / i5, Bitmap.Config.ARGB_8888);
                        fhgVar.f.setImageBitmap(createBitmap);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        int b2 = fhgVar.b();
                        int i6 = fhgVar.k;
                        Bitmap createBitmap2 = Bitmap.createBitmap(b2 / i6, fhgVar.a() / i6, Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        return createBitmap2;
                    case 2:
                        return RenderScript.create(fhgVar.a);
                    case 3:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.l.getValue());
                    case 4:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.m.getValue());
                    default:
                        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(fhgVar.c(), Element.U8_4(fhgVar.c()));
                        create.setRadius(fhgVar.c.e != null ? r1.intValue() : 1.0f);
                        Object value = fhgVar.o.getValue();
                        value.getClass();
                        create.setInput((Allocation) value);
                        return create;
                }
            }
        });
        final int i4 = 1;
        this.m = ypa.b(new Function0(this) { // from class: bhg
            public final /* synthetic */ fhg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                fhg fhgVar = this.b;
                switch (i42) {
                    case 0:
                        int b = fhgVar.b();
                        int i5 = fhgVar.k;
                        Bitmap createBitmap = Bitmap.createBitmap(b / i5, fhgVar.a() / i5, Bitmap.Config.ARGB_8888);
                        fhgVar.f.setImageBitmap(createBitmap);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        int b2 = fhgVar.b();
                        int i6 = fhgVar.k;
                        Bitmap createBitmap2 = Bitmap.createBitmap(b2 / i6, fhgVar.a() / i6, Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        return createBitmap2;
                    case 2:
                        return RenderScript.create(fhgVar.a);
                    case 3:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.l.getValue());
                    case 4:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.m.getValue());
                    default:
                        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(fhgVar.c(), Element.U8_4(fhgVar.c()));
                        create.setRadius(fhgVar.c.e != null ? r1.intValue() : 1.0f);
                        Object value = fhgVar.o.getValue();
                        value.getClass();
                        create.setInput((Allocation) value);
                        return create;
                }
            }
        });
        this.n = ypa.b(new Function0(this) { // from class: bhg
            public final /* synthetic */ fhg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i;
                fhg fhgVar = this.b;
                switch (i42) {
                    case 0:
                        int b = fhgVar.b();
                        int i5 = fhgVar.k;
                        Bitmap createBitmap = Bitmap.createBitmap(b / i5, fhgVar.a() / i5, Bitmap.Config.ARGB_8888);
                        fhgVar.f.setImageBitmap(createBitmap);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        int b2 = fhgVar.b();
                        int i6 = fhgVar.k;
                        Bitmap createBitmap2 = Bitmap.createBitmap(b2 / i6, fhgVar.a() / i6, Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        return createBitmap2;
                    case 2:
                        return RenderScript.create(fhgVar.a);
                    case 3:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.l.getValue());
                    case 4:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.m.getValue());
                    default:
                        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(fhgVar.c(), Element.U8_4(fhgVar.c()));
                        create.setRadius(fhgVar.c.e != null ? r1.intValue() : 1.0f);
                        Object value = fhgVar.o.getValue();
                        value.getClass();
                        create.setInput((Allocation) value);
                        return create;
                }
            }
        });
        final int i5 = 3;
        this.o = ypa.b(new Function0(this) { // from class: bhg
            public final /* synthetic */ fhg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i5;
                fhg fhgVar = this.b;
                switch (i42) {
                    case 0:
                        int b = fhgVar.b();
                        int i52 = fhgVar.k;
                        Bitmap createBitmap = Bitmap.createBitmap(b / i52, fhgVar.a() / i52, Bitmap.Config.ARGB_8888);
                        fhgVar.f.setImageBitmap(createBitmap);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        int b2 = fhgVar.b();
                        int i6 = fhgVar.k;
                        Bitmap createBitmap2 = Bitmap.createBitmap(b2 / i6, fhgVar.a() / i6, Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        return createBitmap2;
                    case 2:
                        return RenderScript.create(fhgVar.a);
                    case 3:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.l.getValue());
                    case 4:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.m.getValue());
                    default:
                        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(fhgVar.c(), Element.U8_4(fhgVar.c()));
                        create.setRadius(fhgVar.c.e != null ? r1.intValue() : 1.0f);
                        Object value = fhgVar.o.getValue();
                        value.getClass();
                        create.setInput((Allocation) value);
                        return create;
                }
            }
        });
        this.p = ypa.b(new Function0(this) { // from class: bhg
            public final /* synthetic */ fhg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i2;
                fhg fhgVar = this.b;
                switch (i42) {
                    case 0:
                        int b = fhgVar.b();
                        int i52 = fhgVar.k;
                        Bitmap createBitmap = Bitmap.createBitmap(b / i52, fhgVar.a() / i52, Bitmap.Config.ARGB_8888);
                        fhgVar.f.setImageBitmap(createBitmap);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        int b2 = fhgVar.b();
                        int i6 = fhgVar.k;
                        Bitmap createBitmap2 = Bitmap.createBitmap(b2 / i6, fhgVar.a() / i6, Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        return createBitmap2;
                    case 2:
                        return RenderScript.create(fhgVar.a);
                    case 3:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.l.getValue());
                    case 4:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.m.getValue());
                    default:
                        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(fhgVar.c(), Element.U8_4(fhgVar.c()));
                        create.setRadius(fhgVar.c.e != null ? r1.intValue() : 1.0f);
                        Object value = fhgVar.o.getValue();
                        value.getClass();
                        create.setInput((Allocation) value);
                        return create;
                }
            }
        });
        final int i6 = 5;
        this.q = ypa.b(new Function0(this) { // from class: bhg
            public final /* synthetic */ fhg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i6;
                fhg fhgVar = this.b;
                switch (i42) {
                    case 0:
                        int b = fhgVar.b();
                        int i52 = fhgVar.k;
                        Bitmap createBitmap = Bitmap.createBitmap(b / i52, fhgVar.a() / i52, Bitmap.Config.ARGB_8888);
                        fhgVar.f.setImageBitmap(createBitmap);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        int b2 = fhgVar.b();
                        int i62 = fhgVar.k;
                        Bitmap createBitmap2 = Bitmap.createBitmap(b2 / i62, fhgVar.a() / i62, Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        return createBitmap2;
                    case 2:
                        return RenderScript.create(fhgVar.a);
                    case 3:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.l.getValue());
                    case 4:
                        return Allocation.createFromBitmap(fhgVar.c(), (Bitmap) fhgVar.m.getValue());
                    default:
                        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(fhgVar.c(), Element.U8_4(fhgVar.c()));
                        create.setRadius(fhgVar.c.e != null ? r1.intValue() : 1.0f);
                        Object value = fhgVar.o.getValue();
                        value.getClass();
                        create.setInput((Allocation) value);
                        return create;
                }
            }
        });
        textureView.setSurfaceTextureListener(new dhg(this));
    }

    public final int a() {
        vg6 vg6Var = (vg6) this.b;
        vg6Var.j0();
        int i = vg6Var.j0.b;
        return i <= 0 ? this.c.c : i;
    }

    public final int b() {
        vg6 vg6Var = (vg6) this.b;
        vg6Var.j0();
        int i = vg6Var.j0.a;
        return i <= 0 ? this.c.b : i;
    }

    public final RenderScript c() {
        Object value = this.n.getValue();
        value.getClass();
        return (RenderScript) value;
    }
}
