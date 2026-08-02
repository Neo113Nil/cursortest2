package Sb;

import com.facebook.react.bridge.Dynamic;
import java.util.Locale;

/* loaded from: classes3.dex */
public class f extends k {

    /* renamed from: b, reason: collision with root package name */
    public String f10705b;

    public f() {
        super(e());
        this.f10705b = d();
    }

    public static String d() {
        return Locale.getDefault().toLanguageTag().replace('-', '_');
    }

    public static Locale e() {
        return com.henninghall.date_picker.h.f(d());
    }

    public String f() {
        return this.f10705b;
    }

    @Override // Sb.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Locale c(Dynamic dynamic) {
        String replace = dynamic.asString().replace('-', '_');
        this.f10705b = replace;
        return com.henninghall.date_picker.h.f(replace);
    }
}
