package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f16539f;

    /* renamed from: a, reason: collision with root package name */
    public int f16540a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f16541b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f16542c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f16543d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f16544e;

    public d(Context context, int i10) {
        super(context);
        this.f16540a = i10;
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f16539f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f16539f = configuration2;
        }
        return configuration.equals(f16539f);
    }

    public void a(Configuration configuration) {
        if (this.f16544e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f16543d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f16543d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f16544e == null) {
            Configuration configuration = this.f16543d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f16544e = super.getResources();
            } else {
                this.f16544e = createConfigurationContext(this.f16543d).getResources();
            }
        }
        return this.f16544e;
    }

    public int c() {
        return this.f16540a;
    }

    public final void d() {
        boolean z10 = this.f16541b == null;
        if (z10) {
            this.f16541b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f16541b.setTo(theme);
            }
        }
        f(this.f16541b, this.f16540a, z10);
    }

    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f16542c == null) {
            this.f16542c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f16542c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f16541b;
        if (theme != null) {
            return theme;
        }
        if (this.f16540a == 0) {
            this.f16540a = l.i.f55164h;
        }
        d();
        return this.f16541b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f16540a != i10) {
            this.f16540a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f16541b = theme;
    }
}
