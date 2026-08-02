package org.mp4parser.support;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
/* loaded from: classes10.dex */
public class RequiresParseDetailAspect {
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static /* synthetic */ RequiresParseDetailAspect ajc$perSingletonInstance;

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th) {
            ajc$initFailureCause = th;
        }
    }

    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new RequiresParseDetailAspect();
    }

    public static RequiresParseDetailAspect aspectOf() {
        RequiresParseDetailAspect requiresParseDetailAspect = ajc$perSingletonInstance;
        if (requiresParseDetailAspect != null) {
            return requiresParseDetailAspect;
        }
        throw new NoAspectBoundException("org.mp4parser.support.RequiresParseDetailAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    @Before("this(org.mp4parser.support.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* setOffset(*)) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(org.mp4parser.support.DoNotParseDetail)) || @annotation(org.mp4parser.support.ParseDetail))")
    public void before(JoinPoint joinPoint) {
        if (joinPoint.getTarget() instanceof AbstractBox) {
            if (((AbstractBox) joinPoint.getTarget()).isParsed()) {
                return;
            }
            ((AbstractBox) joinPoint.getTarget()).parseDetails();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + AbstractBox.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
