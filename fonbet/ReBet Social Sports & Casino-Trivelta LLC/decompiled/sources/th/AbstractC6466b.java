package th;

import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import rh.InterfaceC6299q;

/* renamed from: th.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6466b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f65829a = Pattern.compile("[ \t]*,[ \t]*");

    public static /* synthetic */ void a(StringBuilder sb2, String str, String str2) {
        if (sb2.length() != 0) {
            sb2.append(',');
        }
        sb2.append(str);
        sb2.append('=');
        sb2.append(str2);
    }

    public static String b(InterfaceC6299q interfaceC6299q) {
        if (interfaceC6299q.isEmpty()) {
            return "";
        }
        final StringBuilder sb2 = new StringBuilder(512);
        interfaceC6299q.forEach(new BiConsumer() { // from class: th.a
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC6466b.a(sb2, (String) obj, (String) obj2);
            }
        });
        return sb2.toString();
    }
}
