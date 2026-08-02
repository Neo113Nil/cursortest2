package v8;

import T7.InterfaceC1668h;

/* renamed from: v8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6656e implements InterfaceC1668h {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);


    /* renamed from: a, reason: collision with root package name */
    public int f67076a;

    EnumC6656e(int i10) {
        this.f67076a = i10;
    }

    @Override // T7.InterfaceC1668h
    public int a() {
        return this.f67076a;
    }

    @Override // T7.InterfaceC1668h
    public String b() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }
}
