package defpackage;

import com.sofascore.model.database.MediaReactionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t31 implements Function0 {
    public final /* synthetic */ boh a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MediaReactionType c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public t31(boh bohVar, Function1 function1, MediaReactionType mediaReactionType, int i, int i2, String str) {
        this.a = bohVar;
        this.b = function1;
        this.c = mediaReactionType;
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        boh bohVar = this.a;
        if (currentTimeMillis - bohVar.h() >= 200) {
            bohVar.i(currentTimeMillis);
            MediaReactionType mediaReactionType = MediaReactionType.THUMBS_UP;
            MediaReactionType mediaReactionType2 = this.c;
            this.b.invoke(new lw7(this.d, this.e, mediaReactionType2 == mediaReactionType ? mediaReactionType : null, mediaReactionType2 == mediaReactionType ? null : mediaReactionType, this.f));
        }
        return Unit.a;
    }
}
