package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i29 extends hz8 {
    public final BreakIterator o;

    public i29(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.o = characterInstance;
    }

    @Override // defpackage.hz8
    public final int S(int i) {
        return this.o.following(i);
    }

    @Override // defpackage.hz8
    public final int W(int i) {
        return this.o.preceding(i);
    }
}
