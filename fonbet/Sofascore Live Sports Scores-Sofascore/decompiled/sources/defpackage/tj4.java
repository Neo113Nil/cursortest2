package defpackage;

import com.sofascore.model.chat.ChatUser;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class tj4 extends r0d {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj4(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.reflect.KProperty0
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((l0a) this.receiver).b;
            case 1:
                return ((l0a) this.receiver).b;
            case 2:
                return ((l0a) this.receiver).d;
            case 3:
                return ((n0a) this.receiver).a;
            case 4:
                return ((n0a) this.receiver).b;
            case 5:
                return ((n0a) this.receiver).d;
            case 6:
                return ((l0a) this.receiver).a.b;
            case 7:
                return ((p0a) this.receiver).b;
            case 8:
                return ((p0a) this.receiver).c;
            case 9:
                return ((p0a) this.receiver).d;
            case 10:
                return ((n0a) this.receiver).e;
            case 11:
                return ((fhc) this.receiver).J();
            case 12:
                return ((fhc) this.receiver).r;
            case 13:
                return ((fhc) this.receiver).q;
            case 14:
                return ((fhc) this.receiver).J();
            case 15:
                return ((fhc) this.receiver).J();
            case 16:
                return ((fhc) this.receiver).J();
            case 17:
                return ((fhc) this.receiver).r;
            case 18:
                return ((fhc) this.receiver).q;
            case 19:
                return ((fhc) this.receiver).J();
            case 20:
                return ((fhc) this.receiver).r;
            case 21:
                return ((fhc) this.receiver).q;
            case 22:
                return Integer.valueOf(((fyi) this.receiver).n);
            default:
                return ((e1d) this.receiver).getValue();
        }
    }

    @Override // kotlin.reflect.KMutableProperty0
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                ((l0a) this.receiver).b = (Integer) obj;
                break;
            case 1:
                ((l0a) this.receiver).b = (Integer) obj;
                break;
            case 2:
                ((l0a) this.receiver).d = (Integer) obj;
                break;
            case 3:
                ((n0a) this.receiver).a = (Integer) obj;
                break;
            case 4:
                ((n0a) this.receiver).b = (Integer) obj;
                break;
            case 5:
                ((n0a) this.receiver).d = (Integer) obj;
                break;
            case 6:
                ((l0a) this.receiver).a.b = (Integer) obj;
                break;
            case 7:
                ((p0a) this.receiver).b = (Integer) obj;
                break;
            case 8:
                ((p0a) this.receiver).c = (Integer) obj;
                break;
            case 9:
                ((p0a) this.receiver).d = (Integer) obj;
                break;
            case 10:
                ((n0a) this.receiver).e = (Integer) obj;
                break;
            case 11:
                ((fhc) this.receiver).t = (ChatUser) obj;
                break;
            case 12:
                ((fhc) this.receiver).r = (Set) obj;
                break;
            case 13:
                ((fhc) this.receiver).q = (String) obj;
                break;
            case 14:
                ((fhc) this.receiver).t = (ChatUser) obj;
                break;
            case 15:
                ((fhc) this.receiver).t = (ChatUser) obj;
                break;
            case 16:
                ((fhc) this.receiver).t = (ChatUser) obj;
                break;
            case 17:
                ((fhc) this.receiver).r = (Set) obj;
                break;
            case 18:
                ((fhc) this.receiver).q = (String) obj;
                break;
            case 19:
                ((fhc) this.receiver).t = (ChatUser) obj;
                break;
            case 20:
                ((fhc) this.receiver).r = (Set) obj;
                break;
            case 21:
                ((fhc) this.receiver).q = (String) obj;
                break;
            case 22:
                ((fyi) this.receiver).n = ((Number) obj).intValue();
                break;
            default:
                ((e1d) this.receiver).setValue(obj);
                break;
        }
    }
}
