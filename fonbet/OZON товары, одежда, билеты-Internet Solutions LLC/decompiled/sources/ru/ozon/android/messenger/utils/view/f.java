package ru.ozon.android.messenger.utils.view;

import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class f {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92005a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92005a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r4 == null) goto L23;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e a(LabeledIconMetaDTO labeledIconMetaDTO) {
        c cVar;
        d iconPosition;
        Icon icon = labeledIconMetaDTO != null ? labeledIconMetaDTO.getIcon() : null;
        TextDTO label = labeledIconMetaDTO != null ? labeledIconMetaDTO.getLabel() : null;
        if (labeledIconMetaDTO != null && (iconPosition = labeledIconMetaDTO.getIconPosition()) != null) {
            int i11 = a.f92005a[iconPosition.ordinal()];
            if (i11 == -1) {
                cVar = c.LEFT;
            } else if (i11 == 1) {
                cVar = c.LEFT;
            } else {
                if (i11 != 2) {
                    throw new Sc.o();
                }
                cVar = c.RIGHT;
            }
        }
        cVar = c.LEFT;
        return new e(icon, label, cVar);
    }
}
