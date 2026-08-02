package tvo.webrtc;

/* loaded from: classes5.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: tvo.webrtc.Predicate.2
            @Override // tvo.webrtc.Predicate
            public boolean test(T t10) {
                return Predicate.this.test(t10) && predicate.test(t10);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: tvo.webrtc.Predicate.3
            @Override // tvo.webrtc.Predicate
            public boolean test(T t10) {
                return !Predicate.this.test(t10);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: tvo.webrtc.Predicate.1
            @Override // tvo.webrtc.Predicate
            public boolean test(T t10) {
                return Predicate.this.test(t10) || predicate.test(t10);
            }
        };
    }

    boolean test(T t10);
}
