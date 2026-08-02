package ru.ozon.fintech.network.models;

import com.squareup.moshi.h;
import com.squareup.moshi.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/fintech/network/models/CustomMapAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/n;", "reader", "", "", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/util/Map;", "fintech-network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CustomMapAdapter {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96627a;

        static {
            int[] iArr = new int[n.b.values().length];
            try {
                iArr[n.b.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.b.BEGIN_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f96627a = iArr;
        }
    }

    @h
    @NotNull
    public final Map<String, Object> fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            n.b p11 = reader.p();
            switch (p11 == null ? -1 : a.f96627a[p11.ordinal()]) {
                case 1:
                    linkedHashMap.put(nextName, reader.nextString());
                    break;
                case 2:
                    double nextDouble = reader.nextDouble();
                    int i11 = (int) nextDouble;
                    linkedHashMap.put(nextName, nextDouble == ((double) i11) ? Integer.valueOf(i11) : Double.valueOf(nextDouble));
                    break;
                case 3:
                    linkedHashMap.put(nextName, Boolean.valueOf(reader.k()));
                    break;
                case 4:
                    reader.m();
                    linkedHashMap.put(nextName, null);
                    break;
                case 5:
                    linkedHashMap.put(nextName, fromJson(reader));
                    break;
                case 6:
                    ArrayList arrayList = new ArrayList();
                    reader.beginArray();
                    while (reader.hasNext()) {
                        n.b p12 = reader.p();
                        int i12 = p12 == null ? -1 : a.f96627a[p12.ordinal()];
                        if (i12 == 1) {
                            arrayList.add(reader.nextString());
                        } else if (i12 == 2) {
                            double nextDouble2 = reader.nextDouble();
                            int i13 = (int) nextDouble2;
                            arrayList.add(nextDouble2 == ((double) i13) ? Integer.valueOf(i13) : Double.valueOf(nextDouble2));
                        } else if (i12 == 3) {
                            arrayList.add(Boolean.valueOf(reader.k()));
                        } else if (i12 == 4) {
                            reader.m();
                            arrayList.add(null);
                        } else if (i12 != 5) {
                            reader.skipValue();
                        } else {
                            arrayList.add(fromJson(reader));
                        }
                    }
                    reader.endArray();
                    linkedHashMap.put(nextName, arrayList);
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }
        reader.endObject();
        return linkedHashMap;
    }
}
