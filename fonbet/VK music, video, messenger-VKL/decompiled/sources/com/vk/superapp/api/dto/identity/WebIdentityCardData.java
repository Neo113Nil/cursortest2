package com.vk.superapp.api.dto.identity;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;

/* compiled from: WebIdentityCardData.kt */
/* loaded from: classes6.dex */
public final class WebIdentityCardData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebIdentityCardData> CREATOR = new a();
    public final List<WebIdentityPhone> b;
    public final List<WebIdentityEmail> c;
    public final List<WebIdentityAddress> d;
    public final List<WebCountry> e;
    public final List<WebCity> f;
    public final List<WebIdentityLimit> g;
    public final HashMap<String, ArrayList<WebIdentityLabel>> h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebIdentityCardData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebIdentityCardData a(Serializer serializer) {
            return new WebIdentityCardData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebIdentityCardData[i];
        }
    }

    public WebIdentityCardData(List<WebIdentityPhone> list, List<WebIdentityEmail> list2, List<WebIdentityAddress> list3, List<WebCountry> list4, List<WebCity> list5, List<WebIdentityLimit> list6) {
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
        this.h = new HashMap<>();
        Hb("phone");
        Hb("email");
        Hb(RTCStatsConstants.KEY_ADDRESS);
    }

    public final WebIdentityCard Ab(int i, String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1147692044) {
            if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                return zb(i);
            }
            return null;
        }
        if (hashCode == 96619420) {
            if (str.equals("email")) {
                return Db(i);
            }
            return null;
        }
        if (hashCode == 106642798 && str.equals("phone")) {
            return Fb(i);
        }
        return null;
    }

    public final WebCity Bb(int i) {
        Iterator<T> it = this.f.iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((WebCity) next).b == i) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (WebCity) obj;
    }

    public final WebCountry Cb(int i) {
        Iterator<T> it = this.e.iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((WebCountry) next).b == i) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (WebCountry) obj;
    }

    public final WebIdentityEmail Db(int i) {
        Iterator<T> it = this.c.iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((WebIdentityEmail) next).d == i) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (WebIdentityEmail) obj;
    }

    public final ArrayList<WebIdentityCard> Eb(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1147692044) {
            if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    return (ArrayList) this.b;
                }
            } else if (str.equals("email")) {
                return (ArrayList) this.c;
            }
        } else if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
            return (ArrayList) this.d;
        }
        return new ArrayList<>();
    }

    public final WebIdentityPhone Fb(int i) {
        Iterator<T> it = this.b.iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((WebIdentityPhone) next).d == i) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (WebIdentityPhone) obj;
    }

    public final int Gb(WebIdentityCard webIdentityCard) {
        int i = -1;
        if (webIdentityCard == null) {
            return -1;
        }
        ArrayList<WebIdentityCard> Eb = Eb(webIdentityCard.getType());
        int zb = webIdentityCard.zb();
        int i2 = 0;
        for (Object obj : Eb) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (((WebIdentityCard) obj).zb() == zb) {
                i = i2;
            }
            i2 = i3;
        }
        return i;
    }

    public final void Hb(String str) {
        ArrayList<WebIdentityCard> Eb = Eb(str);
        ArrayList<WebIdentityLabel> arrayList = new ArrayList<>();
        Iterator<T> it = Eb.iterator();
        while (it.hasNext()) {
            WebIdentityLabel Ab = ((WebIdentityCard) it.next()).Ab();
            if (Ab.zb() && arrayList.indexOf(Ab) == -1) {
                arrayList.add(Ab);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.h.put(str, arrayList);
    }

    public final boolean Ib(String str) {
        int size = Eb(str).size();
        Iterator<T> it = this.g.iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (epx.f(((WebIdentityLimit) next).b, str)) {
                    if (z) {
                        break;
                    }
                    obj2 = next;
                    z = true;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return size >= ((WebIdentityLimit) obj).c;
    }

    public final void Jb(int i, String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1147692044) {
            if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                this.d.remove(i);
            }
        } else if (hashCode == 96619420) {
            if (str.equals("email")) {
                this.c.remove(i);
            }
        } else if (hashCode == 106642798 && str.equals("phone")) {
            this.b.remove(i);
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.W(this.c);
        serializer.W(this.d);
        serializer.W(this.e);
        serializer.W(this.f);
        serializer.W(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebIdentityCardData)) {
            return false;
        }
        WebIdentityCardData webIdentityCardData = (WebIdentityCardData) obj;
        return epx.f(this.b, webIdentityCardData.b) && epx.f(this.c, webIdentityCardData.c) && epx.f(this.d, webIdentityCardData.d) && epx.f(this.e, webIdentityCardData.e) && epx.f(this.f, webIdentityCardData.f) && epx.f(this.g, webIdentityCardData.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + fw3.a(fw3.a(fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebIdentityCardData(phones=");
        sb.append(this.b);
        sb.append(", emails=");
        sb.append(this.c);
        sb.append(", addresses=");
        sb.append(this.d);
        sb.append(", countries=");
        sb.append(this.e);
        sb.append(", cities=");
        sb.append(this.f);
        sb.append(", limits=");
        return ms9.a(')', sb, this.g);
    }

    public final WebIdentityAddress zb(int i) {
        Iterator<T> it = this.d.iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((WebIdentityAddress) next).f == i) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (WebIdentityAddress) obj;
    }

    public WebIdentityCardData(Serializer serializer) {
        this(serializer.l(WebIdentityPhone.class.getClassLoader()), serializer.l(WebIdentityEmail.class.getClassLoader()), serializer.l(WebIdentityAddress.class.getClassLoader()), serializer.l(WebCountry.class.getClassLoader()), serializer.l(WebCity.class.getClassLoader()), serializer.l(WebIdentityLimit.class.getClassLoader()));
    }
}
