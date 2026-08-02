package vg;

import java.text.MessageFormat;

/* loaded from: classes4.dex */
public abstract class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public String f67166a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f67167b;
    private String[] values;

    public b(String str) {
        super(str);
        this.f67166a = str;
        this.f67167b = false;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f67167b ? MessageFormat.format(this.f67166a, this.values) : this.f67166a;
    }
}
