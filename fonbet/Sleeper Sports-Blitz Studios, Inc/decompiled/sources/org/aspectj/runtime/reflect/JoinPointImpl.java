package org.aspectj.runtime.reflect;

import java.util.Stack;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.runtime.internal.AroundClosure;

/* loaded from: classes10.dex */
class JoinPointImpl implements ProceedingJoinPoint {
    Object _this;
    private AroundClosure arc = null;
    private Stack<AroundClosure> arcs = null;
    Object[] args;
    JoinPoint.StaticPart staticPart;
    Object target;

    static class StaticPartImpl implements JoinPoint.StaticPart {
        private int id;
        String kind;
        Signature signature;
        SourceLocation sourceLocation;

        public StaticPartImpl(int i, String str, Signature signature, SourceLocation sourceLocation) {
            this.kind = str;
            this.signature = signature;
            this.sourceLocation = sourceLocation;
            this.id = i;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public int getId() {
            return this.id;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public String getKind() {
            return this.kind;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public Signature getSignature() {
            return this.signature;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public SourceLocation getSourceLocation() {
            return this.sourceLocation;
        }

        String toString(StringMaker stringMaker) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(stringMaker.makeKindName(getKind()));
            stringBuffer.append("(");
            stringBuffer.append(((SignatureImpl) getSignature()).toString(stringMaker));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public final String toString() {
            return toString(StringMaker.middleStringMaker);
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public final String toShortString() {
            return toString(StringMaker.shortStringMaker);
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public final String toLongString() {
            return toString(StringMaker.longStringMaker);
        }
    }

    static class EnclosingStaticPartImpl extends StaticPartImpl implements JoinPoint.EnclosingStaticPart {
        public EnclosingStaticPartImpl(int i, String str, Signature signature, SourceLocation sourceLocation) {
            super(i, str, signature, sourceLocation);
        }
    }

    public JoinPointImpl(JoinPoint.StaticPart staticPart, Object obj, Object obj2, Object[] objArr) {
        this.staticPart = staticPart;
        this._this = obj;
        this.target = obj2;
        this.args = objArr;
    }

    @Override // org.aspectj.lang.JoinPoint
    public Object getThis() {
        return this._this;
    }

    @Override // org.aspectj.lang.JoinPoint
    public Object getTarget() {
        return this.target;
    }

    @Override // org.aspectj.lang.JoinPoint
    public Object[] getArgs() {
        if (this.args == null) {
            this.args = new Object[0];
        }
        Object[] objArr = this.args;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // org.aspectj.lang.JoinPoint
    public JoinPoint.StaticPart getStaticPart() {
        return this.staticPart;
    }

    @Override // org.aspectj.lang.JoinPoint
    public String getKind() {
        return this.staticPart.getKind();
    }

    @Override // org.aspectj.lang.JoinPoint
    public Signature getSignature() {
        return this.staticPart.getSignature();
    }

    @Override // org.aspectj.lang.JoinPoint
    public SourceLocation getSourceLocation() {
        return this.staticPart.getSourceLocation();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toString() {
        return this.staticPart.toString();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toShortString() {
        return this.staticPart.toShortString();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toLongString() {
        return this.staticPart.toLongString();
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public void set$AroundClosure(AroundClosure aroundClosure) {
        this.arc = aroundClosure;
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public void stack$AroundClosure(AroundClosure aroundClosure) {
        if (this.arcs == null) {
            this.arcs = new Stack<>();
        }
        if (aroundClosure == null) {
            this.arcs.pop();
        } else {
            this.arcs.push(aroundClosure);
        }
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public Object proceed() throws Throwable {
        Stack<AroundClosure> stack = this.arcs;
        if (stack == null) {
            AroundClosure aroundClosure = this.arc;
            if (aroundClosure == null) {
                return null;
            }
            return aroundClosure.run(aroundClosure.getState());
        }
        return stack.peek().run(this.arcs.peek().getState());
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public Object proceed(Object[] objArr) throws Throwable {
        AroundClosure peek;
        int i;
        Stack<AroundClosure> stack = this.arcs;
        if (stack == null) {
            peek = this.arc;
        } else {
            peek = stack.peek();
        }
        if (peek == null) {
            return null;
        }
        int flags = peek.getFlags();
        boolean z = (65536 & flags) != 0;
        int i2 = (flags & 4096) != 0 ? 1 : 0;
        int i3 = (flags & 256) != 0 ? 1 : 0;
        boolean z2 = (flags & 16) != 0;
        boolean z3 = (flags & 1) != 0;
        Object[] state = peek.getState();
        int i4 = ((!z2 || z) ? 0 : 1) + i2;
        if (i2 == 0 || i3 == 0) {
            i = 0;
        } else {
            state[0] = objArr[0];
            i = 1;
        }
        if (z2 && z3) {
            if (z) {
                i = i3 + 1;
                state[0] = objArr[i3];
            } else {
                char c = (i2 == 0 || i3 == 0) ? (char) 0 : (char) 1;
                int i5 = (i2 == 0 || i3 == 0) ? 0 : 1;
                int i6 = (z2 && z3 && !z) ? 1 : 0;
                state[i2] = objArr[c];
                i = i5 + i6;
            }
        }
        for (int i7 = i; i7 < objArr.length; i7++) {
            state[(i7 - i) + i4] = objArr[i7];
        }
        return peek.run(state);
    }
}
