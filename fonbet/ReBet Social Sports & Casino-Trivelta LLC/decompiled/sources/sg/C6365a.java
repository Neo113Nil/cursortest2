package sg;

/* renamed from: sg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6365a {

    /* renamed from: a, reason: collision with root package name */
    public byte f64885a;

    /* renamed from: sg.a$a, reason: collision with other inner class name */
    public enum EnumC0904a {
        containsSecKey(0),
        isSecKeyEncrypted(1),
        isEncoded(2),
        containsCRC64(3),
        containsCRC32(4);


        /* renamed from: a, reason: collision with root package name */
        public int f64891a;

        EnumC0904a(int i10) {
            this.f64891a = i10;
        }

        public int b() {
            return this.f64891a;
        }
    }

    public C6365a(byte b10) {
        this.f64885a = b10;
    }

    public static boolean b(EnumC0904a enumC0904a, byte b10) {
        return ((1 << enumC0904a.b()) & b10) > 0;
    }

    public boolean a(EnumC0904a enumC0904a) {
        return ((1 << enumC0904a.b()) & this.f64885a) > 0;
    }
}
