package com.blaze.blazesdk.features.shared.models.shared_models;

import defpackage.atm;
import defpackage.km5;
import defpackage.qrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c {
    public static final List a(List list) {
        if (list == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RenditionsDto renditionsDto = (RenditionsDto) it.next();
            atm b = renditionsDto != null ? b(renditionsDto) : null;
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r1.equals("fourtofive") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        r3 = new defpackage.qrl(4.0d, 5.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if (r1.equals("4to5") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        if (r1.equals("four_to_five") == false) goto L63;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final atm b(RenditionsDto renditionsDto) {
        String aspectRatio;
        qrl qrlVar;
        qrl qrlVar2;
        String str;
        List split$default;
        String aspectRatioDescription = renditionsDto != null ? renditionsDto.getAspectRatioDescription() : null;
        if (aspectRatioDescription == null || StringsKt.R(aspectRatioDescription)) {
            String aspectRatio2 = renditionsDto != null ? renditionsDto.getAspectRatio() : null;
            if (aspectRatio2 != null && !StringsKt.R(aspectRatio2) && (aspectRatio = renditionsDto.getAspectRatio()) != null) {
                String lowerCase = StringsKt.l0(aspectRatio).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -1984141450:
                        if (lowerCase.equals("vertical")) {
                            qrlVar = new qrl(9.0d, 16.0d);
                            qrlVar2 = qrlVar;
                            break;
                        }
                        break;
                    case -1817009187:
                        break;
                    case -894674659:
                        if (lowerCase.equals("square")) {
                            qrlVar2 = new qrl(1.0d, 1.0d);
                            break;
                        }
                        break;
                    case 1664102:
                        break;
                    case 1387629604:
                        if (lowerCase.equals("horizontal")) {
                            qrlVar = new qrl(16.0d, 9.0d);
                            qrlVar2 = qrlVar;
                            break;
                        }
                        break;
                    case 1939695699:
                        break;
                }
            }
            qrlVar2 = null;
        } else {
            String aspectRatioDescription2 = renditionsDto.getAspectRatioDescription();
            if (aspectRatioDescription2 != null) {
                String obj = StringsKt.l0(aspectRatioDescription2).toString();
                if (StringsKt.J(obj, ":", false)) {
                    split$default = StringsKt__StringsKt.split$default(obj, new String[]{":"}, false, 0, 6, null);
                    if (split$default.size() == 2) {
                        Double f = kotlin.text.b.f(StringsKt.l0((String) split$default.get(0)).toString());
                        Double f2 = kotlin.text.b.f(StringsKt.l0((String) split$default.get(1)).toString());
                        if (f != null && f2 != null && f.doubleValue() > 0.0d && f2.doubleValue() > 0.0d) {
                            qrlVar2 = new qrl(f.doubleValue(), f2.doubleValue());
                        }
                    }
                }
            }
            qrlVar2 = null;
        }
        if (renditionsDto == null || (str = renditionsDto.getUrl()) == null) {
            str = "";
        }
        return new atm(str, renditionsDto != null ? renditionsDto.getBitRate() : null, renditionsDto != null ? renditionsDto.getFileSize() : null, qrlVar2);
    }
}
