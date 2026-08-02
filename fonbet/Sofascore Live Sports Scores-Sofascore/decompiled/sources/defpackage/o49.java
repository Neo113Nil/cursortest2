package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o49 extends u4k {
    public final /* synthetic */ int a;

    public /* synthetic */ o49(int i) {
        this.a = i;
    }

    public static pfa c(JsonReader jsonReader, JsonToken jsonToken) {
        int i = z4k.a[jsonToken.ordinal()];
        if (i == 1) {
            return new rga(new ioa(jsonReader.nextString()));
        }
        if (i == 2) {
            return new rga(jsonReader.nextString());
        }
        if (i == 3) {
            return new rga(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i == 6) {
            jsonReader.nextNull();
            return gga.a;
        }
        yhk.r(jsonToken, "Unexpected token: ");
        return null;
    }

    public static pfa d(JsonReader jsonReader, JsonToken jsonToken) {
        int i = z4k.a[jsonToken.ordinal()];
        if (i == 4) {
            jsonReader.beginArray();
            return new bfa();
        }
        if (i != 5) {
            return null;
        }
        jsonReader.beginObject();
        return new iga();
    }

    public static void e(pfa pfaVar, JsonWriter jsonWriter) {
        if (pfaVar == null || (pfaVar instanceof gga)) {
            jsonWriter.nullValue();
            return;
        }
        if (pfaVar instanceof rga) {
            rga rgaVar = (rga) pfaVar;
            Serializable serializable = rgaVar.a;
            if (serializable instanceof Number) {
                jsonWriter.value(rgaVar.d());
                return;
            } else if (serializable instanceof Boolean) {
                jsonWriter.value(rgaVar.c());
                return;
            } else {
                jsonWriter.value(rgaVar.e());
                return;
            }
        }
        if (pfaVar instanceof bfa) {
            jsonWriter.beginArray();
            Iterator it = ((bfa) pfaVar).a.iterator();
            while (it.hasNext()) {
                e((pfa) it.next(), jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        if (!(pfaVar instanceof iga)) {
            zzl.i(pfaVar.getClass(), "Couldn't write ");
            return;
        }
        jsonWriter.beginObject();
        Iterator it2 = ((kbb) ((iga) pfaVar).a.entrySet()).iterator();
        while (((lbb) it2).hasNext()) {
            mbb a = ((jbb) it2).a();
            jsonWriter.name((String) a.getKey());
            e((pfa) a.getValue(), jsonWriter);
        }
        jsonWriter.endObject();
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        boolean z;
        switch (this.a) {
            case 0:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 1:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 2:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e) {
                        throw new yga(e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new yga(e2);
                }
            case 5:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 6:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            case 7:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                StringBuilder q = wt3.q("Expecting character, got: ", nextString, "; at ");
                q.append(jsonReader.getPreviousPath());
                throw new yga(q.toString());
            case 8:
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            case 9:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString2 = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString2);
                } catch (NumberFormatException e3) {
                    eg4.a(wt3.q("Failed parsing '", nextString2, "' as BigDecimal; at path "), jsonReader.getPreviousPath(), e3);
                    return null;
                }
            case 10:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString3 = jsonReader.nextString();
                try {
                    return new BigInteger(nextString3);
                } catch (NumberFormatException e4) {
                    eg4.a(wt3.q("Failed parsing '", nextString3, "' as BigInteger; at path "), jsonReader.getPreviousPath(), e4);
                    return null;
                }
            case 11:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new ioa(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 12:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 15:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString4 = jsonReader.nextString();
                if ("null".equals(nextString4)) {
                    return null;
                }
                return new URL(nextString4);
            case 16:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString5 = jsonReader.nextString();
                    if ("null".equals(nextString5)) {
                        return null;
                    }
                    return new URI(nextString5);
                } catch (URISyntaxException e5) {
                    throw new zfa(e5);
                }
            case 17:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 18:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString6 = jsonReader.nextString();
                try {
                    return UUID.fromString(nextString6);
                } catch (IllegalArgumentException e6) {
                    eg4.a(wt3.q("Failed parsing '", nextString6, "' as UUID; at path "), jsonReader.getPreviousPath(), e6);
                    return null;
                }
            case 19:
                String nextString7 = jsonReader.nextString();
                try {
                    return Currency.getInstance(nextString7);
                } catch (IllegalArgumentException e7) {
                    eg4.a(wt3.q("Failed parsing '", nextString7, "' as Currency; at path "), jsonReader.getPreviousPath(), e7);
                    return null;
                }
            case 20:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("month".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i6 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i7 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            case 21:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            case 22:
                if (jsonReader instanceof iha) {
                    iha ihaVar = (iha) jsonReader;
                    JsonToken peek2 = ihaVar.peek();
                    if (peek2 == JsonToken.NAME || peek2 == JsonToken.END_ARRAY || peek2 == JsonToken.END_OBJECT || peek2 == JsonToken.END_DOCUMENT) {
                        ilg.f(peek2, " when reading a JsonElement.", "Unexpected ");
                        return null;
                    }
                    pfa pfaVar = (pfa) ihaVar.k();
                    ihaVar.skipValue();
                    return pfaVar;
                }
                JsonToken peek3 = jsonReader.peek();
                pfa d = d(jsonReader, peek3);
                if (d == null) {
                    return c(jsonReader, peek3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String nextName2 = d instanceof iga ? jsonReader.nextName() : null;
                        JsonToken peek4 = jsonReader.peek();
                        pfa d2 = d(jsonReader, peek4);
                        boolean z2 = d2 != null;
                        if (d2 == null) {
                            d2 = c(jsonReader, peek4);
                        }
                        if (d instanceof bfa) {
                            ((bfa) d).a.add(d2);
                        } else {
                            ((iga) d).a.put(nextName2, d2);
                        }
                        if (z2) {
                            arrayDeque.addLast(d);
                            d = d2;
                        }
                    } else {
                        if (d instanceof bfa) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return d;
                        }
                        d = (pfa) arrayDeque.removeLast();
                    }
                }
                break;
            case 23:
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken peek5 = jsonReader.peek();
                int i8 = 0;
                while (peek5 != JsonToken.END_ARRAY) {
                    int i9 = z4k.a[peek5.ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        int nextInt2 = jsonReader.nextInt();
                        if (nextInt2 == 0) {
                            z = false;
                        } else {
                            if (nextInt2 != 1) {
                                StringBuilder t = lnb.t(nextInt2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                t.append(jsonReader.getPreviousPath());
                                throw new yga(t.toString());
                            }
                            z = true;
                        }
                    } else {
                        if (i9 != 3) {
                            StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                            sb.append(peek5);
                            String path = jsonReader.getPath();
                            sb.append("; at path ");
                            sb.append(path);
                            throw new yga(sb.toString());
                        }
                        z = jsonReader.nextBoolean();
                    }
                    if (z) {
                        bitSet.set(i8);
                    }
                    i8++;
                    peek5 = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            case 24:
                JsonToken peek6 = jsonReader.peek();
                if (peek6 != JsonToken.NULL) {
                    return peek6 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            case 25:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            case 26:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt3 = jsonReader.nextInt();
                    if (nextInt3 <= 255 && nextInt3 >= -128) {
                        return Byte.valueOf((byte) nextInt3);
                    }
                    StringBuilder t2 = lnb.t(nextInt3, "Lossy conversion from ", " to byte; at path ");
                    t2.append(jsonReader.getPreviousPath());
                    throw new yga(t2.toString());
                } catch (NumberFormatException e8) {
                    throw new yga(e8);
                }
            case 27:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt4 = jsonReader.nextInt();
                    if (nextInt4 <= 65535 && nextInt4 >= -32768) {
                        return Short.valueOf((short) nextInt4);
                    }
                    StringBuilder t3 = lnb.t(nextInt4, "Lossy conversion from ", " to short; at path ");
                    t3.append(jsonReader.getPreviousPath());
                    throw new yga(t3.toString());
                } catch (NumberFormatException e9) {
                    throw new yga(e9);
                }
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new yga(e10);
                }
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.checkValidFloatingPoint(doubleValue);
                jsonWriter.value(doubleValue);
                return;
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                float floatValue = number2.floatValue();
                Gson.checkValidFloatingPoint(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                jsonWriter.value(number2);
                return;
            case 2:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(number3.toString());
                    return;
                }
            case 3:
                jsonWriter.beginArray();
                int length = ((AtomicIntegerArray) obj).length();
                while (i < length) {
                    jsonWriter.value(r5.get(i));
                    i++;
                }
                jsonWriter.endArray();
                return;
            case 4:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(number4.longValue());
                    return;
                }
            case 5:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                if (!(number5 instanceof Float)) {
                    number5 = Float.valueOf(number5.floatValue());
                }
                jsonWriter.value(number5);
                return;
            case 6:
                Number number6 = (Number) obj;
                if (number6 == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(number6.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                jsonWriter.value(ch != null ? String.valueOf(ch) : null);
                return;
            case 8:
                jsonWriter.value((String) obj);
                return;
            case 9:
                jsonWriter.value((BigDecimal) obj);
                return;
            case 10:
                jsonWriter.value((BigInteger) obj);
                return;
            case 11:
                jsonWriter.value((ioa) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                jsonWriter.value(sb != null ? sb.toString() : null);
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                jsonWriter.value(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case 15:
                URL url = (URL) obj;
                jsonWriter.value(url != null ? url.toExternalForm() : null);
                return;
            case 16:
                URI uri = (URI) obj;
                jsonWriter.value(uri != null ? uri.toASCIIString() : null);
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                jsonWriter.value(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case 18:
                UUID uuid = (UUID) obj;
                jsonWriter.value(uuid != null ? uuid.toString() : null);
                return;
            case 19:
                jsonWriter.value(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                if (((Calendar) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(r5.get(1));
                jsonWriter.name("month");
                jsonWriter.value(r5.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(r5.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(r5.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(r5.get(12));
                jsonWriter.name("second");
                jsonWriter.value(r5.get(13));
                jsonWriter.endObject();
                return;
            case 21:
                Locale locale = (Locale) obj;
                jsonWriter.value(locale != null ? locale.toString() : null);
                return;
            case 22:
                e((pfa) obj, jsonWriter);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                jsonWriter.beginArray();
                int length2 = bitSet.length();
                while (i < length2) {
                    jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                    i++;
                }
                jsonWriter.endArray();
                return;
            case 24:
                jsonWriter.value((Boolean) obj);
                return;
            case 25:
                Boolean bool = (Boolean) obj;
                jsonWriter.value(bool == null ? "null" : bool.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(r5.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(r5.shortValue());
                    return;
                }
            default:
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    jsonWriter.value(r5.intValue());
                    return;
                }
        }
    }
}
