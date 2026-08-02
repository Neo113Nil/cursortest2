package pi;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.format.g;
import net.time4j.format.m;
import net.time4j.format.t;
import net.time4j.format.v;
import oi.o;

/* loaded from: classes5.dex */
public interface e extends t {
    void f(o oVar, Appendable appendable, Locale locale, v vVar, m mVar);

    Object k(CharSequence charSequence, ParsePosition parsePosition, Locale locale, v vVar, m mVar, g gVar);
}
