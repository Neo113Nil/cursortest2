package org.maplibre.android.maps.renderer.egl;

import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes10.dex */
public class EGLLogWrapper implements EGL11 {
    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglChooseConfig(EGLDisplay eGLDisplay, int[] iArr, EGLConfig[] eGLConfigArr, int i11, int[] iArr2) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglCopyBuffers(EGLDisplay eGLDisplay, EGLSurface eGLSurface, Object obj) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLContext eglCreateContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglCreatePbufferSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglCreatePixmapSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglCreateWindowSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglDestroyContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglDestroySurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglGetConfigAttrib(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglGetConfigs(EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, int i11, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLContext eglGetCurrentContext() {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLDisplay eglGetCurrentDisplay() {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglGetCurrentSurface(int i11) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLDisplay eglGetDisplay(Object obj) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final int eglGetError() {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglInitialize(EGLDisplay eGLDisplay, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglMakeCurrent(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLSurface eGLSurface2, EGLContext eGLContext) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglQueryContext(EGLDisplay eGLDisplay, EGLContext eGLContext, int i11, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final String eglQueryString(EGLDisplay eGLDisplay, int i11) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglQuerySurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i11, int[] iArr) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglSwapBuffers(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglTerminate(EGLDisplay eGLDisplay) {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglWaitGL() {
        throw null;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglWaitNative(int i11, Object obj) {
        throw null;
    }
}
