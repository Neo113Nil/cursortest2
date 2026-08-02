package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f20761f;

    /* renamed from: a, reason: collision with root package name */
    public int f20762a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f20763b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f20764c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f20765d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f20766e;

    public d(Context context, int i5) {
        super(context);
        this.f20762a = i5;
    }

    public final void a(Configuration configuration) {
        if (this.f20766e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f20765d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f20765d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f20763b == null) {
            this.f20763b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f20763b.setTo(theme);
            }
        }
        this.f20763b.applyStyle(this.f20762a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(n.d.f20761f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f20766e == null) {
            Configuration configuration = this.f20765d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f20761f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f20761f = configuration2;
                    }
                }
                this.f20766e = createConfigurationContext(this.f20765d).getResources();
            }
            this.f20766e = super.getResources();
        }
        return this.f20766e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f20764c == null) {
            this.f20764c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f20764c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f20763b;
        if (theme != null) {
            return theme;
        }
        if (this.f20762a == 0) {
            this.f20762a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f20763b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i5) {
        if (this.f20762a != i5) {
            this.f20762a = i5;
            b();
        }
    }
}
