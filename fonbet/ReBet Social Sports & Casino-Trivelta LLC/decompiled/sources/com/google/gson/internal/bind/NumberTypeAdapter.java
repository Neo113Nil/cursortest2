package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;

/* loaded from: classes3.dex */
public final class NumberTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final v f38135b = b(t.f38338b);

    /* renamed from: a, reason: collision with root package name */
    public final u f38136a;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[Jb.b.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[Jb.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(u uVar) {
        this.f38136a = uVar;
    }

    public static v a(u uVar) {
        return uVar == t.f38338b ? f38135b : b(uVar);
    }

    public static v b(u uVar) {
        return new v() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Number read(Jb.a aVar) {
        Jb.b Y12 = aVar.Y1();
        int i10 = a.$SwitchMap$com$google$gson$stream$JsonToken[Y12.ordinal()];
        if (i10 == 1) {
            aVar.n1();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f38136a.a(aVar);
        }
        throw new q("Expecting number, got: " + Y12 + "; at path " + aVar.l());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Number number) {
        cVar.j2(number);
    }
}
