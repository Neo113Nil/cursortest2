package ug;

import androidx.appcompat.widget.y;
import com.android.billingclient.api.l0;
import com.android.billingclient.api.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f24275a = new k();

    public static final h a(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return d(-1, "Unexpected special floating-point value " + value + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) o(-1, output)));
    }

    public static final h b(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new h("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) o(-1, output)), 1);
    }

    public static final h c(qg.g keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new h("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final h d(int i5, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i5 >= 0) {
            message = "Unexpected JSON token at offset " + i5 + ": " + message;
        }
        return new h(message, 0);
    }

    public static final h e(int i5, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return d(i5, message + "\nJSON input: " + ((Object) o(i5, input)));
    }

    public static final u f(tg.c json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        y yVar = json.f23937a;
        return new u(source);
    }

    public static final qg.g g(qg.g descriptor, c4.d module) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(descriptor.e(), qg.i.f22176e)) {
            return descriptor.isInline() ? g(descriptor.i(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ag.c kClass = u6.h.i(descriptor);
        if (kClass == null) {
            return descriptor;
        }
        e0 typeArgumentsSerializers = e0.f19204a;
        module.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return descriptor;
    }

    public static final byte h(char c2) {
        if (c2 < '~') {
            return d.f24268b[c2];
        }
        return (byte) 0;
    }

    public static final String i(qg.g gVar, tg.c json) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : gVar.getAnnotations()) {
            if (annotation instanceof tg.i) {
                return ((tg.i) annotation).discriminator();
            }
        }
        return (String) json.f23937a.f1009f;
    }

    public static final void j(tg.c json, l0 sb2, og.a serializer, ic.e0 e0Var) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb2, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        w mode = w.f24323c;
        s[] modeReuseCache = new s[w.f24328h.size()];
        Intrinsics.checkNotNullParameter(sb2, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        y yVar = json.f23937a;
        new s(new u0(sb2), json, mode, modeReuseCache).p(serializer, e0Var);
    }

    public static final int k(qg.g descriptor, tg.c json, String name) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        y yVar = json.f23937a;
        p(descriptor, json);
        int d10 = descriptor.d(name);
        if (d10 != -3 || !json.f23937a.f1007d) {
            return d10;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        r7.a aVar = json.f23939c;
        a2.l defaultValue = new a2.l(14, descriptor, json);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        k key = f24275a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object value = aVar.g(descriptor, key);
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.f22318b;
            Object obj = concurrentHashMap.get(descriptor);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, obj);
            }
            ((Map) obj).put(key, value);
        }
        Integer num = (Integer) ((Map) value).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int l(qg.g gVar, tg.c json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int k6 = k(gVar, json, name);
        if (k6 != -3) {
            return k6;
        }
        throw new og.f(gVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final boolean m(qg.g gVar, tg.c json) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (json.f23937a.f1005b) {
            return true;
        }
        List annotations = gVar.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof tg.q) {
                return true;
            }
        }
        return false;
    }

    public static final void n(u uVar, String entity) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        uVar.l(uVar.f24316a - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence o(int i5, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i5 != -1) {
                int i10 = i5 - 30;
                int i11 = i5 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder b10 = v.f.b(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                b10.append(charSequence.subSequence(i10, i11).toString());
                b10.append(str2);
                return b10.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void p(qg.g gVar, tg.c json) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(gVar.e(), qg.k.f22178e)) {
            y yVar = json.f23937a;
        }
    }

    public static final Object q(tg.c cVar, String discriminator, tg.y element, og.a deserializer) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new m(cVar, element, discriminator, deserializer.d()).a(deserializer);
    }

    public static final w r(qg.g desc, tg.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        a.a e7 = desc.e();
        if (e7 instanceof qg.d) {
            return w.f24326f;
        }
        if (Intrinsics.areEqual(e7, qg.k.f22179f)) {
            return w.f24324d;
        }
        if (!Intrinsics.areEqual(e7, qg.k.f22180g)) {
            return w.f24323c;
        }
        qg.g g10 = g(desc.i(0), cVar.f23938b);
        a.a e9 = g10.e();
        if ((e9 instanceof qg.f) || Intrinsics.areEqual(e9, qg.j.f22177e)) {
            return w.f24325e;
        }
        throw c(g10);
    }

    public static final void s(u uVar, Number result) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        u.m(uVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String t(byte b10) {
        return b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
