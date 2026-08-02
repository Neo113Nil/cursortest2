package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: FieldMaskKt.kt */
/* loaded from: classes13.dex */
public final class FieldMaskKt {
    public static final FieldMaskKt INSTANCE = new FieldMaskKt();

    /* compiled from: FieldMaskKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FieldMask.Builder _builder;

        /* compiled from: FieldMaskKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FieldMask.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: FieldMaskKt.kt */
        public static final class PathsProxy extends DslProxy {
            private PathsProxy() {
            }
        }

        public /* synthetic */ Dsl(FieldMask.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ FieldMask _build() {
            return this._builder.build();
        }

        /* renamed from: addAllPaths, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllPaths(DslList dslList, Iterable iterable) {
            this._builder.addAllPaths(iterable);
        }

        /* renamed from: addPaths, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignPaths(DslList dslList, String str) {
            this._builder.addPaths(str);
        }

        public final /* synthetic */ void clearPaths(DslList dslList) {
            this._builder.clearPaths();
        }

        public final DslList<String, PathsProxy> getPaths() {
            return new DslList<>(this._builder.getPathsList());
        }

        public final /* synthetic */ void setPaths(DslList dslList, int i, String str) {
            this._builder.setPaths(i, str);
        }

        private Dsl(FieldMask.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldMaskKt() {
    }
}
